package org.emp;

public class Employee {
	public static Employee obj;
	public void Empid() {
		System.out.println("empid + 1234");
	}
	public void Empid(String email) {
		System.out.println(email);
		System.out.println("empid + 1234");
	}
	public void Empid(double sal) {
		System.out.println();
		System.out.println("empid + 1234");
	}
	public void empid(String  Name, int age)
	{
		System.out.println("Emp id+1234");
	}
	public static void main (String[]args)
	{
		Employee.obj = new Employee();
		obj.Empid();
		
	}
		
	}


