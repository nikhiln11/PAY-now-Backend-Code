package com.paynow.now.model;

public class AfterPay {
		double amountSent;
	  String senderName;
	  String receiverName;
	  String payTime;
	  double senderId;
	  String messageCode;
	  String transferTypes;
	
	  
	public AfterPay(double amountSent, String senderName, String receiverName, String payTime, double senderId,
			String messageCode, String transferTypes) {
		super();
		this.amountSent = amountSent;
		this.senderName = senderName;
		this.receiverName = receiverName;
		this.payTime = payTime;
		this.senderId = senderId;
		this.messageCode = messageCode;
		this.transferTypes = transferTypes;

	}
	
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	
	public double getAmountSent() {
		return amountSent;
	}
	public void setAmountSent(double amountSent) {
		this.amountSent = amountSent;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public double getSenderId() {
		return senderId;
	}
	public void setSenderId(double senderId) {
		this.senderId = senderId;
	}
	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public String getTransferTypes() {
		return transferTypes;
	}
	public void setTransferTypes(String transferTypes) {
		this.transferTypes = transferTypes;
	}
	public AfterPay() {
		super();
		// TODO Auto-generated constructor stub
	}
}
