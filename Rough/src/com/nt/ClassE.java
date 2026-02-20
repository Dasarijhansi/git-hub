package com.nt;

public class ClassE {

	public static void main(String[] args) {
		int ab[]= {1,4,6,2,8,9,3};
		int temp;
		for(int i=0;i<ab.length;i++)
		{
			for(int j=0;j<ab.length;j++)
			{
				if(ab[i]>ab[j])
				{
					temp=ab[i];
					ab[i]=ab[j];
					ab[j]=temp;
				}
			}
		}
		System.out.println(ab[1]);
	}
}
