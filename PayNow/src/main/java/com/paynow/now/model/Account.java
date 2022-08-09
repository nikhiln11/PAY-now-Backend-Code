package com.paynow.now.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
 @Id
 String customerId;
 String customerName;
 int accountBalance;
 boolean overDraft;
 String BIC;
 String bankName;
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(int accountBalance) {
	this.accountBalance = accountBalance;
}
public boolean isOverDraft() {
	return overDraft;
}
public void setOverDraft(boolean overDraft) {
	this.overDraft = overDraft;
}
public String getBIC() {
	return BIC;
}
public void setBIC(String bIC) {
	BIC = bIC;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public Account(String customerId, String customerName, int accountBalance, boolean overDraft, String bIC,
		String bankName) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.accountBalance = accountBalance;
	this.overDraft = overDraft;
	BIC = bIC;
	this.bankName = bankName;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
