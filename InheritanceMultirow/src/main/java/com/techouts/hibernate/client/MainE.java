package com.techouts.hibernate.client;

import java.util.*;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.techouts.hibernate.pojo.Employee;

public class MainE {

	public static void main(String[] args) 
	{
		Configuration config=new Configuration().configure("employee.cfg.xml");
		SessionFactory fact=config.buildSessionFactory();
		Session session=fact.openSession(); 
		Transaction tx=session.beginTransaction();
		
		/*Employee e=new Employee();
		e.setEmpId(7);
		e.setEmpName("swathi");
		e.setSalary(100000);
		e.setAddress("Vizag");
		e.setComm(200);
		e.setContact("125875457");
		
		Employee e1=new Employee();
		e1.setEmpId(8);
		e1.setEmpName("hema");
		e1.setSalary(120000);
		e1.setAddress("Hyd");
		e1.setComm(200);
		e1.setContact("125875457");
		
		session.save(e);
		session.save(e1);
		tx.commit();
		*/
		/*Query query=session.createQuery("from Employee"); 
		List<Employee> list= query.list();
		
		for(Employee emp: list)
		{
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
		}*/
		
		Query query=session.createQuery("select empId from Employee"); 
		List list= query.list();
		
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object i = (Object)it.next();

			System.out.println("EmpId : "+i);

		}
		
		
		session.close();

		
	}

}
