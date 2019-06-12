package com.techouts.hibernate.client;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.techouts.hibernate.pojo.EmployeeN;


public class MainEN {

	public static void main(String[] args) 
	{
		 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("employeeN.cfg.xml").build();  
	        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	          
	        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        Session session=factory.openSession(); 
		Transaction tx=session.beginTransaction();
		
		EmployeeN e=new EmployeeN();
		e.setEmpId(1);
		e.setEmpName("Swathi");
		e.setAddress("Vizag");
		e.setComm(200);
		e.setContact("125875457");
		
		EmployeeN e1=new EmployeeN();
		e1.setEmpId(2);
		e1.setEmpName("Hema");
		e1.setAddress("Hyd");
		e1.setComm(200);
		e1.setContact("125875457");

		
		session.save(e);
		session.save(e1);
		tx.commit();

		
		TypedQuery query = session.getNamedQuery("q1");    
        query.setParameter("name","hema");   
                
        List<EmployeeN> employees=query.getResultList();   
        
        Iterator<EmployeeN> itr=employees.iterator();    
        while(itr.hasNext())
        {    
        	EmployeeN emp=itr.next();    
        	System.out.println(emp.getEmpName());    
        }    
        
		session.close();

		
	}

}
