package com.paynow.now.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sender {
	@Id
	double customerId;
	String accountHolderName;
	double clearBalance;
	String overDraft;
	public double getCustomerId() {
		return customerId;
	}
	public void setCustomerId(double customerId) {
		this.customerId = customerId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}
	public String getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(String overDraft) {
		this.overDraft = overDraft;
	}
	public Sender(double customerId, String accountHolderName, double clearBalance, String overDraft) {
		super();
		this.customerId = customerId;
		this.accountHolderName = accountHolderName;
		this.clearBalance = clearBalance;
		this.overDraft = overDraft;
	}
	public Sender() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
