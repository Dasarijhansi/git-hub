package com.nr.pack4;

public class ClassA {

	
	private Integer sno;
	private String sname;
	private Integer sdep;
	public ClassA(Integer sno, String sname, Integer sdep) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sdep = sdep;
	}
	@Override
	public String toString() {
		return "ClassA [sno=" + sno + ", sname=" + sname + ", sdep=" + sdep + "]";
	}
	
	
}
