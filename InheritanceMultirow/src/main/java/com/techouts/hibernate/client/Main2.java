package com.techouts.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techouts.hibernate.pojo.ChequePayment2;
import com.techouts.hibernate.pojo.CreditCard2;

public class Main2 {

	public static void main(String[] args) 
	{
		Configuration config=new Configuration().configure("main2.cfg.xml");
		SessionFactory fact=config.buildSessionFactory();
		Session session=fact.openSession(); 
		Transaction tx=session.beginTransaction();
		
		CreditCard2 cc=new CreditCard2();
		cc.setPayId(1);
		cc.setAmount(2000);
		cc.setCardType("VISA");
		
		
		ChequePayment2 cp=new ChequePayment2();
		cp.setPayId(2);
		cp.setAmount(3000);
		cp.setChequetype("CHEQUE");
		
		
		CreditCard2 cc1=new CreditCard2();
		cc1.setPayId(3);
		cc1.setAmount(4000);
		cc1.setCardType("MASTER");
		

		ChequePayment2 cp1=new ChequePayment2();
		cp1.setPayId(4);
		cp1.setAmount(5000);
		cp1.setChequetype("CHEQUE");
		
		session.save(cc);
		session.save(cp);
		session.save(cc1);
		session.save(cp1);

		

		tx.commit();
		session.close();
	}

}
