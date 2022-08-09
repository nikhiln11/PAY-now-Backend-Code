package com.paynow.now.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BIC {
	@Id
 String bic;
 String bankName;
public BIC() {
	super();
	// TODO Auto-generated constructor stub
}
public BIC(String bic, String bankName) {
	super();
	this.bic = bic;
	this.bankName = bankName;
}
public String getBic() {
	return bic;
}
public void setBic(String bic) {
	this.bic = bic;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
 
}
