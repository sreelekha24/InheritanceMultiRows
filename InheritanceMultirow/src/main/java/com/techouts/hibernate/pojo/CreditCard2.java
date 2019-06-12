package com.techouts.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table(name="CreditCard")
@PrimaryKeyJoinColumn(name="payId")

public class CreditCard2 extends Payment
{
	@Column(name = "id")  
	private String cardType;

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	
}
