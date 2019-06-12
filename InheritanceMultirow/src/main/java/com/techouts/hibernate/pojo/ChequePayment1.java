package com.techouts.hibernate.pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="Cheque1")
@AttributeOverrides({  
    @AttributeOverride(name="payId", column=@Column(name="PayId")),  
    @AttributeOverride(name="amount", column=@Column(name="Amount"))  
})  public class ChequePayment1 extends Payment
{
	@Column(name = "ChequeType")  
	private String chequetype;

	public String getChequetype() {
		return chequetype;
	}

	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}
	
}
