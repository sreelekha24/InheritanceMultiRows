package com.techouts.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techouts.hibernate.pojo.ChequePayment1;
import com.techouts.hibernate.pojo.CreditCard1;

public class Main1 {

	public static void main(String[] args) 
	{
		Configuration config=new Configuration().configure("main1.cfg.xml");
		SessionFactory fact=config.buildSessionFactory();
		Session session=fact.openSession(); 
		Transaction tx=session.beginTransaction();
		
		CreditCard1 cc=new CreditCard1();
		cc.setPayId(1);
		cc.setAmount(2000);
		cc.setCardType("VISA");
		
		
		ChequePayment1 cp=new ChequePayment1();
		cp.setPayId(2);
		cp.setAmount(3000);
		cp.setChequetype("CHEQUE");
		
		
		CreditCard1 cc1=new CreditCard1();
		cc1.setPayId(3);
		cc1.setAmount(4000);
		cc1.setCardType("MASTER");
		

		ChequePayment1 cp1=new ChequePayment1();
		cp1.setPayId(4);
		cp1.setAmount(4000);
		cp1.setChequetype("CHEQUE");
		
		session.save(cc);
		session.save(cp);
		session.save(cc1);
		session.save(cp1);

		

		tx.commit();
		session.close();
	}

}
