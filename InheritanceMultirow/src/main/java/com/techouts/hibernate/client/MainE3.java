package com.techouts.hibernate.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import com.techouts.hibernate.pojo.Employee2;


public class MainE3 {

	public static void main(String[] args) //Scalar sql 
	
	{
		Configuration config=new Configuration().configure("employee2.cfg.xml");
		SessionFactory fact=config.buildSessionFactory();
		Session session=fact.openSession(); 
		Transaction tx=session.beginTransaction();
		
		Employee2 e=new Employee2();
		e.setEmpId(1);
		e.setEmpName("swathi");
		e.setAddress("Vizag");
		e.setComm(200);
		e.setContact("125875457");
		
		Employee2 e1=new Employee2();
		e1.setEmpId(2);
		e1.setEmpName("hema");
		e1.setAddress("Hyd");
		e1.setComm(200);
		e1.setContact("125875457");

		
		session.save(e);
		session.save(e1);
		tx.commit();
		
		/*SQLQuery query = session.createSQLQuery("select * from Employee2");
		query.addEntity(Employee2.class);
		List employees = query.list();
		
		Iterator iterator = employees.iterator(); 
		while (iterator.hasNext()){
            Employee2 employee = (Employee2) iterator.next(); 
            System.out.print("EmployeeId: " + employee.getEmpId()); 
            System.out.print(" EmployeeName: " + employee.getEmpName()); 
            System.out.println(" Location: " + employee.getAddress()); 

         }*/
		SQLQuery query = session.createSQLQuery("select empId, empName from Employee2").addScalar("empid", new IntegerType())
							.addScalar("empName", new StringType());
		List list = query.list();
		
		 Iterator iterator = list.iterator();

	        while (iterator.hasNext()) 
	        {
	            Object[] object = (Object[]) iterator.next();
	            System.out.println("EmpId : " + object[0] + " EmpName : " + object[1]);
	        }
		
		session.close();

		
	}

}
