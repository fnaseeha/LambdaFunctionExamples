package com.naseeha;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRanker {
	public static void main(String[] args){
		
		
		List<Employee>getFilterArray = 
				Employee.getAllEmployee().stream()
				.filter(e->e.getName().contains("i"))
				.collect(Collectors.toList());
		
		System.out.println(getFilterArray); //[Anni, Zimba]
		
		List<Employee>mapFilterArray = 
				Employee.getAllEmployee().stream()
				.map(e->new Employee("Dr. "+e.getName(),e.getMarks()))
				.collect(Collectors.toList());
		
		System.out.println(mapFilterArray); //[Dr. Anni, Dr. Ben, Dr. Ren, Dr. Zimba]
		
		List<Employee> sortedList = 
				Employee.getAllEmployee().stream()
				.sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		
		System.out.println(sortedList); //[Anni, Ben, Ren, Zimba]
		
		List<Employee> SortByNameLength = 
				Employee.getAllEmployee().stream()
				.sorted((e1,e2)-> new Integer(e1.getName().length()).compareTo(e2.getName().length()))
				.collect(Collectors.toList());
		
		System.out.println(SortByNameLength); //[Ben, Ren, Anni, Zimba]
		
		
		
	}
    

}
