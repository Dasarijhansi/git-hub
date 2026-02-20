package com.nt;

public class ClassE implements InterfaceA,InterfaceB {

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("meth1");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		InterfaceB.super.show();
	}

	public static void main(String[] args) {
		
		InterfaceB aobj=new ClassE();
		aobj.meth1();
		
	}
}
