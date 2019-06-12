package com.techouts.hibernate.pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name="CreditCard1")
@AttributeOverrides({  
    @AttributeOverride(name="payId", column=@Column(name="PayId")),  
    @AttributeOverride(name="amount", column=@Column(name="Amount"))  
})  
public class CreditCard1 extends Payment
{
	@Column(name = "CardType")  
	private String cardType;

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	
}
