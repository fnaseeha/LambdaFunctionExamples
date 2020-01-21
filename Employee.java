package com.naseeha;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	String name;
	int marks;
	
	public Employee(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return getName();
	}

	static List<Employee> getAllEmployee(){
		List<Employee> AllEmployee = new ArrayList<>();
		AllEmployee.add(new Employee("Anni",30));
		AllEmployee.add(new Employee("Ben",50));
		AllEmployee.add(new Employee("Ren",67));
		AllEmployee.add(new Employee("Zimba",64));
		return AllEmployee;	
	}
	
}
