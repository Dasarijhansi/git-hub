package com.nr.pack1;

public class ClassA {

	private int sno;
	private String sname;
	private String sdep;
	private int sal;
	public ClassA(int sno, String sname, String sdep, int sal) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sdep = sdep;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "sno=" + sno + ", sname=" + sname + ", sdep=" + sdep + ", sal=" + sal ;
	}
	
	
	
}
