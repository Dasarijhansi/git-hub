package com.nt.nt2;

public interface InterfaceA {

	void meth1();
	default void meth2()
	{
		System.out.println("default meth in InterfaceA");
	}
	
	private void meth3()
	{
		System.out.println("provate method");
	}
	
	public static void main(String[] args) {
		
		
	}
	
}
