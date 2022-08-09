package com.paynow.now.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paynow.now.model.AfterPay;
import com.paynow.now.model.BIC;
//import com.paynow.now.model.Account;
import com.paynow.now.model.Sender;
import com.paynow.now.model.Transaction;
import com.paynow.now.repo.BICRepo;
//import com.paynow.now.repo.AccountRepo;
import com.paynow.now.repo.SenderRepo;
import com.paynow.now.repo.TransactionRepo;

@Service
public class PayService {
	@Autowired
	SenderRepo myRepo; 
	@Autowired
	BICRepo iRepo;
	@Autowired
	TransactionRepo tRepo;
	
	public List<Sender> getAllSenders()
	{
		List<Sender> a = myRepo.findAll();
		return a;
	}
	public List<BIC> getAllBIC()
	{
		List<BIC> a = iRepo.findAll();
		return a;

	}
	public Optional<Sender> authenticate(double a)
	{
		Optional<Sender> a1=myRepo.findById(a);
		return a1;
	}
	public Optional<BIC> bicAuthen(String a)
	{
		Optional<BIC> b1=iRepo.findById(a);
		return b1;
	}
	public Transaction sendMoney(AfterPay b) {
		
		long i = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		String tId=String.valueOf(i);
		Transaction t= new Transaction(tId,b.getSenderName(),b.getReceiverName(),b.getMessageCode(),b.getSenderId(),b.getAmountSent(),"failure",b.getPayTime(),b.getTransferTypes());
		try {
		Sender a=myRepo.findById(b.getSenderId()).get();
		if(b.getAmountSent()<a.getClearBalance())
		{
			t.setPaymentStatus("Success");
			a.setClearBalance(a.getClearBalance()-b.getAmountSent());
			myRepo.save(a);
		}
		else
		t.setPaymentStatus("Failure");	
		tRepo.save(t);
		return t;
	}
	catch(Exception e)
	{
		return null;
	}
		
		
	}
	

}
