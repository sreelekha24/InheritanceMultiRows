package com.techouts.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
@Inheritance(strategy=InheritanceType.JOINED)  

public class Payment2 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "PayId")  
	private int payId;
	
	@Column(name = "Amount")  
	private int amount;
	
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
