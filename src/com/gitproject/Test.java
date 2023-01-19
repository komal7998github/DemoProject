package com.gitproject;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Employee>al=new LinkedList<Employee>();
		al.add(new Employee(101,"Komal",50000));
		al.add(new Employee(102,"Asmita",100000));
		al.add(new Employee(103,"Snehal",70000));
		Collections.sort(al);
		for(Employee e:al) {
			System.out.println("id>> "+e.getId()+"name>> "+e.getName()+"salary>> "+e.getSalary());
		}
		
	}
}
