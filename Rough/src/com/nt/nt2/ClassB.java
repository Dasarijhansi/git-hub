package com.nt.nt2;

public class ClassB implements Runnable
{
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
         cs();
      
	}
	
	void cs()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

public static void main(String[] args) {
		ClassB c=new ClassB();
		Thread t=new Thread(c);
		Thread t1=new Thread(c);
		t.setName("jhanu");
		t.setName("kelvi");
		t.start();
		t1.start();
	}


}
