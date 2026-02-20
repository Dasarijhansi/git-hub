package com.nt.nt1;

public class ClassB {

	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int n=10;
		System.out.println(a);
		System.out.println(b);
		while(n>0)
		{
			int temp=a+b;
			a=b;
			b=temp;
		//	System.out.println(temp);
			n--;
		}
		
		String str[]= {"hdsf","ehf","ahdfs","mhwef","chf"};
		String temp;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
				
			}
		}
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
}
