package com.nr.pack1;

public class ClassB {

	private int sno;
	private String sname;
	private String sdep;
	private int sal;
	public ClassB setSno(int sno) {
		this.sno = sno;
		return this;
		
	}
	public ClassB setSname(String sname) {
		this.sname = sname;
		return this;
	}
	public ClassB setSdep(String sdep) {
		this.sdep = sdep;
		return this;
	}
	public ClassB setSal(int sal) {
		this.sal = sal;
		return this;
	}
	
	public ClassA getdetail()
	{
		return new ClassA(sno,sname,sdep,sal);
	}
	
}
