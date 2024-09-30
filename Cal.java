package com.polymorphism;

public class Cal {
	public  static int add(int a,int b) {
		return a+b;
	}
	public static double add(int a,double b) {
		return a+b;
	}
	public static double add(double a,int b) {
		return a+b;
	}
	public static double add(double a,double b) {
		return a+b;
	}
	public static void main (String[] args) {
		Cal c1=new Cal();
		System.out.println(c1.add(5,6));
		System.out.println(c1.add(5,6.05));
		System.out.println(c1.add(6.05, 5));
		System.out.println(c1.add(6.05,5.00));
	}

}
