package com.techouts.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("Cheque")  
public class ChequePayment extends Payment
{
	@Column(name = "id")  
	private String chequetype;

	public String getChequetype() {
		return chequetype;
	}

	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}
	
}
