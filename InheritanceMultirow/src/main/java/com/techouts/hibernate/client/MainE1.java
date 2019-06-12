package com.techouts.hibernate.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.techouts.hibernate.pojo.Employee1;


public class MainE1 {

	public static void main(String[] args) 
	{
		Configuration config=new Configuration().configure("employee1.cfg.xml");
		SessionFactory fact=config.buildSessionFactory();
		Session session=fact.openSession(); 
		Transaction tx=session.beginTransaction();
		
		Employee1 e=new Employee1();
		e.setEmpId(1);
		e.setEmpName("swathi");
		e.setAddress("Vizag");
		e.setComm(200);
		e.setContact("125875457");
		
		Employee1 e1=new Employee1();
		e1.setEmpId(2);
		e1.setEmpName("hema");
		e1.setAddress("Hyd");
		e1.setComm(200);
		e1.setContact("125875457");

		
		session.save(e);
		session.save(e1);
		tx.commit();
	
		/*Criteria c=session.createCriteria(Employee.class); 
		List<Employee> list=c.list();*/
		
		/*Criteria c=session.createCriteria(Employee1.class);  
		c.add(Restrictions.gt("comm",100));
		List list=c.list();  
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			Employee1 emp=(Employee1)it.next(); 
			System.out.println("EmpId :"+emp.getEmpId());
			System.out.println("EmpName :"+emp.getEmpName());
		}*/
		
		
		Criteria c=session.createCriteria(Employee1.class);  
		c.setProjection(Projections.rowCount());
		List list=c.list();  
		System.out.println("Total no. Of Employees :"+ list.get(0));
				
		session.close();

		
	}

}
