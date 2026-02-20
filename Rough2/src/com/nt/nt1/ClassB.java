package com.nt.nt1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassB implements Runnable {
	
	
	

	public static void main(String[] args) {
		
     ClassB bobj=new ClassB();
     Thread t=new Thread(bobj);
     t.setName("jhanu");
    		   ClassB bobj1=new ClassB();
    		     Thread t1=new Thread(bobj1);
     t1.setName("pallavi");
     t.start();
     t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tt=Thread.currentThread().getName();
		for(int i=0;i<6;i++)
		{
			System.out.println(i+" "+tt);
		}
	}
}
