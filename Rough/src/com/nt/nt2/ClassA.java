package com.nt.nt2;

import java.util.Scanner;

public class ClassA {

	
	void meth1()
	{
		int a[]= {1,2,6,};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==2)
			{
				if(a[i+1]==3)
				{
					a[i+1]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		new ClassA().meth1();
		
	}
}
