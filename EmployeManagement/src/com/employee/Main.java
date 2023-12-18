package com.employee;

import java.util.*;

abstract class Employee{
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		
		this.name=name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}
	
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
		
		return "Employee [name="+name+", id="+id+", salary="+calculateSalary()+"]";
	}
	
	
	}

class FullTimeEmployee extends Employee{
	private double monthlySalary;
	
	public FullTimeEmployee(String name, int id,double monthlySalary) {
		super(name, id);
		this.monthlySalary=monthlySalary;
	}
	@Override
	public double calculateSalary() {
		return monthlySalary;
		
	}
	

	
	
}
	
class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
		super(name, id);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		
		return hoursWorked*hourlyRate;
	}
}

class PayrollSystem{
	private ArrayList<Employee> employeeList;
	
	public PayrollSystem() {
		employeeList = new ArrayList<>();
		
	}
	
	//if employee joins company
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	//if employee resigns from company
	public void RemoveEmployee(int id) {
		Employee employeeToRemove =null;
		
		for(Employee employ : employeeList) {
			if(employ.getId()==id) {
				employeeToRemove = employ;
				break;
			}
		}
			if(employeeToRemove != null) {
				employeeList.remove(employeeToRemove);
			}
	}
	
	public void displayEmployees() {
		for(Employee Display: employeeList) {
			System.out.println(Display);
		}
	}
}
	


public class Main {
	
		
	public static void main(String[] args) {
		PayrollSystem payrollSystem = new PayrollSystem();
		FullTimeEmployee emp1 = new FullTimeEmployee("Kiran", 01, 40000);
		FullTimeEmployee emp2 = new FullTimeEmployee("Kohli", 02, 400);
		FullTimeEmployee emp3 = new FullTimeEmployee("Virat", 03, 500);
		FullTimeEmployee emp4 = new FullTimeEmployee("Pant", 04, 50000);
		FullTimeEmployee emp5 = new FullTimeEmployee("Rahul", 05, 30000);
		PartTimeEmployee emp6 = new PartTimeEmployee("Tharun", 06, 7, 100);
		PartTimeEmployee emp7 = new PartTimeEmployee("Pandya", 07, 7, 100);
		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		payrollSystem.addEmployee(emp3);
		payrollSystem.addEmployee(emp4);
		
		payrollSystem.displayEmployees();
		
	
	}

}
//# Java OOP Concepts Program
//
//This Java program is designed to illustrate Object-Oriented Programming (OOP) concepts. It includes examples of classes, objects, inheritance, polymorphism, encapsulation, and abstraction.
//
//## Table of Contents
//
//- [Features](#features)
//- [Prerequisites](#prerequisites)
//- [Getting Started](#getting-started)
//- [Usage](#usage)
//- [Examples](#examples)
//- [Contributing](#contributing)
//- [License](#license)
//
//## Features
//
//- Example implementations of OOP concepts in Java.
//- Easy-to-understand codebase for educational purposes.
//
//## Prerequisites
//
//- [Java](https://www.java.com/) installed on your machine.
//
//## Getting Started
//
//1. Clone the repository:
//
//   ```bash
//   git clone https://github.com/your-username/your-repository.git
//
//cd your-repository
//
//javac Main.java
//
//java Main

