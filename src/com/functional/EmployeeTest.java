package com.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee
{
	int eid;
	String ename;
	String dept;
	int salary;
	
	
	public Employee(int eid, String ename, String dept, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", salary=" + salary + "]";
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> elist=Arrays.asList(new Employee(1,"Nitish","Dev",60000),
										new Employee(2,"Rohan","Dev",40000),
										new Employee(3,"Ramya","Testing",50000));
		
		Employee emp=elist.stream()
					.max(Comparator.comparing(Employee::getSalary))
					.orElseThrow();
		
		System.out.println("Highest Salary Employee");
		System.out.println(emp);
		System.out.println("=====================");
		elist
		.stream()
		.filter(e->e.dept.equals("Dev"))
		.forEach(System.out::println);
		
		System.out.println("After Sorting");
		elist.stream()
		.sorted(Comparator.comparing(Employee::getEname).reversed())
		.forEach(System.out::println);
		
		System.out.println("========FlatMap");
		
		List<String> developers=
				Arrays.asList("Sandesh","Naveen"
						,"Ravi","Nehru","Vishwas"
						,"Rahul","Pavan","Sharath"
						,"Rakshith","Shashank");
		List<String> testers=
				Arrays.asList("Rajesh","Nitish"
						,"Tirumala","Shalini"
						,"Neha","Saad","Vinay","Vaishnav","Vinay");
		
		List<List<String>> emplist=Arrays.asList(developers,testers);
		
		System.out.println(emplist);
		
		List<String> elist1=emplist
								.stream()
								.flatMap(List::stream)
								.toList();
		System.out.println(elist1);
		
		System.out.println("Removing Duplicates");
		
		testers.stream()
				.distinct()
				.forEach(System.out::println);
		
		
		System.out.println("Second Highest Salary");
		
		elist.stream()
			 .sorted(Comparator
					 .comparing(Employee::getSalary).reversed())
			 .skip(1)
			 .limit(1)
			 .forEach(System.out::println);
		
		
		
		
		
		
		
		
	}
}
