package com.demo.test;

import com.demo.model.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Vaibhav");
		e1.setEmpAddress("kolhapur");
		
		Employee e2 = new Employee(2,"sush","pune");
		
		System.out.println(e1);
		
		System.out.println("E Id : "+e1.getEmpId());
		System.out.println("E Name : "+e1.getEmpName());
		System.out.println("E Address : "+e1.getEmpAddress());
		
		System.out.println(e1.hashCode());
		
		System.out.println(e1.equals(e2));
		
		Employee e3 = Employee.builder()
				.empId(3)
				.empName("pratik")
				.empAddress("mumbai")
				.build();
		
		Employee e4 = Employee.builder()
				.empName("shree")
				.empAddress("kolhapur")
				.build();
		
		System.out.println(e4);
		
		System.out.println(e3);
		
	}

}
