package com.techouts.hibernate.pojo;

public class Employee 
{
	
	private int empId;
	private String empName;
	private String address;
	private String contact;
	private double salary;
	private int comm;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public String getContact() 
	{
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
