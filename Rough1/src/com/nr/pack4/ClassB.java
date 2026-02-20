package com.nr.pack4;

public class ClassB {

	private Integer sno;
	private String sname;
	private Integer sdep;
	
	public ClassB setSno(Integer sno)
	{
		this.sno=sno;
		return this;
	}
	public ClassB setSname(String  sname)
	{
		this.sname=sname;
		return this;
	}
	public ClassB setSdep(Integer sdep)
	{
		this.sdep=sdep;
		return this;
	}
    
	public ClassA getdetails()
	{
		return new ClassA(sno,sname,sdep);
	}
	
	
}
