package com.nt;

public interface InterfaceB {

	void meth1();

	default void show()
	{
		System.out.println("InterfaceA");
	}
}
