package com.techouts.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="Cheque")
@PrimaryKeyJoinColumn(name="payId")
public class ChequePayment2 extends Payment
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
