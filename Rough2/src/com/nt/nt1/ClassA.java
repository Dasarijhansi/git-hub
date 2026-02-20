package com.nt.nt1;


import java.util.HashSet;

public class ClassA {
	
	
	public static void main(String[] args) {
		 
      int a[]= {1,5,4,3,2,4};
      HashSet hs=new HashSet();
      int target=7;
      
      for(int aa:a)
      {
    	  int temp=target-aa;
    	  if(hs.contains(temp))
    	  {
    		  System.out.println(temp+" "+aa);
    	  }
    	  hs.add(aa);
      }
	}
}
