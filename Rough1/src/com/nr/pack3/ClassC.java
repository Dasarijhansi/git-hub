package com.nr.pack3;

public class ClassC {

	private static ClassC c;
	private ClassC()

	{
		
	}
	 private static ClassC singleton()
	 {
		 if(c==null)
		 {
			 c= new ClassC();
		 }
		
			 return c;
		 
	 }
	 
	 public static void main(String[] args) {
		ClassC ab=ClassC.singleton();
		ClassC ab1= ClassC.singleton();
		System.out.println(ab==ab1);
	}
}
