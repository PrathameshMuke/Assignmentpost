package com.assignment.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank 
{
	@Id
	private Long AccountNumber;
private String Name;
private Date modifiedDate;
private String BranchName;
private Float Amount;
private String IFSC;
private String msg;

public Date getModifiedDate() {
	return modifiedDate;
}
public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public Long getAccountNumber() {
	return AccountNumber;
}
public void setAccountNumber(Long accountNumber) {
	AccountNumber = accountNumber;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getBranchName() {
	return BranchName;
}
public void setBranchName(String branchName) {
	BranchName = branchName;
}
public Float getAmount() {
	return Amount;
}
public void setAmount(Float amount) {
	Amount = amount;
}
public String getIFSC() {
	return IFSC;
}
public void setIFSC(String iFSC) {
	IFSC = iFSC;
}

}
