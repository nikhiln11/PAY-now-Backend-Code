package com.paynow.now.model;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Transaction {
	@Id
	String transactionId;
	String senderName;
	String receiverName;
	String messageCode;
	double senderId;
	double amountSent;
	String paymentStatus;
	String paymentTime;
	String transferType;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public void setAmountSent(double amountSent) {
		this.amountSent = amountSent;
	}

	public Transaction(String transactionId, String senderName, String receiverName, String messageCode,
			double senderId, double amountSent, String paymentStatus, String paymentTime, String transferType) {
		super();
		this.transactionId = transactionId;
		this.senderName = senderName;
		this.receiverName = receiverName;
		this.messageCode = messageCode;
		this.senderId = senderId;
		this.amountSent = amountSent;
		this.paymentStatus = paymentStatus;
		this.paymentTime = paymentTime;
		this.transferType = transferType;
	}

	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public double getSenderId() {
		return senderId;
	}
	public void setSenderId(double senderId) {
		this.senderId = senderId;
	}
	public double getAmountSent() {
		return amountSent;
	}
	public void setAmountSent(int amountSent) {
		this.amountSent = amountSent;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}
	
}
