package com.nr.pack4;

public class ClassC {

	public static void main(String[] args) {
		ClassA c=new ClassB().setSdep(101).setSname("jhanu").getdetails();
		System.out.println(c);
	}
}

//The Builder Design Pattern in Java is a creational design pattern used to 
//construct complex objects step-by-step, without directly calling a constructor 
//with too many parameters. It helps make object creation more readable, flexible, and maintainable.