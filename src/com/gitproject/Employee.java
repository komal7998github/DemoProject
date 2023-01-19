package com.gitproject;

public class Employee implements Comparable<Employee> {
	
	
	int id;
	String name;
	int salary;
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getSalary() {
		return salary;
		
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	@Override
	public int compareTo(Employee emp) {
		if(salary==emp.salary)
		return 0;
		else if(salary>emp.salary)
			return 1;
		else 
			return -1;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
