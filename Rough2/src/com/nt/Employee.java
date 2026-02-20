package com.nt;

public class Employee {

	private String fname;
	private String lname;
	private Integer eno;
	private Integer edepno;
	private Integer sal;
	
	public Employee(String fname, String lname, Integer eno, Integer edepno, Integer sal) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.eno = eno;
		this.edepno = edepno;
		this.sal = sal;
	}

	public Employee(int i, int j, String string) {
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public Integer getEdepno() {
		return edepno;
	}

	public void setEdepno(Integer edepno) {
		this.edepno = edepno;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "fname=" + fname + ", lname=" + lname + ", eno=" + eno + ", edepno=" + edepno + ", sal=" + sal;
	}
	
	
	
}
