package com.paynow.now.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paynow.now.model.AfterPay;
import com.paynow.now.model.BIC;
import com.paynow.now.model.Sender;
import com.paynow.now.model.Transaction;
import com.paynow.now.service.PayService;

@RestController
@CrossOrigin("*")
public class PayController {
 @Autowired
 PayService myService;
 @RequestMapping("/")
 public String showMsg()
 {
	 return "<h2>HI this is project</h2>";
 }
 @RequestMapping("/all/senders")
 public List<Sender> showAll()
 {
	 return myService.getAllSenders();
 }
 @RequestMapping("/all/BIC")
 public List<BIC> showAllBic()
 {
	 return myService.getAllBIC();
 }
 @RequestMapping("/home")
 public String helloHome() {

     return "<h1>Welcome to Home   Page for All</h1>";
 }
 
 @GetMapping("/authenticate")
 public Optional<Sender> authenticateCustomer(@RequestParam double c)
 {
	 Optional<Sender> a1=myService.authenticate(c);
	 return a1;
 }
 @GetMapping("/bicauth")
 public Optional<BIC> bicAuth(@RequestParam String s)
 {
	 Optional<BIC> b=myService.bicAuthen(s);
	 return b;
 }
 @PostMapping("/Pay")
 public Transaction transferAmount(@RequestBody AfterPay b)
 {
	 Transaction t = myService.sendMoney(b);
	 return t;
 }
}
