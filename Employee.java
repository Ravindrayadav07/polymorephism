package com.polymorphism;

public class Employee {
	String name;
	int id;
    String deg;
	public void print(String name) {
		System.out.println("name of employee "+name);
	}
	public void print(int id) {
		System.out.println("id of employee "+id);
	}
	public void print(String name,String deg) {
		System.out.println("name of employe "+name+" and desgination of employee "+deg);
	}
	public void print(String name,int id) {
		System.out.println("name of employe "+name+" and id of employee "+id);
	}
public  static void main(String[] args) {
	Employee e1=new Employee();
	e1.print("aman");
	e1.print(10);
	e1.print("aman","softwear devloper");
	e1.print("aman",10);
}
}
