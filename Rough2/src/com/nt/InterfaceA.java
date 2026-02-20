package com.nt;

public interface InterfaceA {

	void meth1();
	
	default void show()
	{
		System.out.println("InterfaceA");
	}
}
