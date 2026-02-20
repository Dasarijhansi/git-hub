package com.nt.nt2;

public class Employe implements Comparable<Employe> {
		
	private Integer eno;
	private Integer edepno;
	private String name;
	
	public Employe(Integer eno, Integer edepno, String name) {
		super();
		this.eno = eno;
		this.edepno = edepno;
		this.name = name;
	}


	@Override
	public String toString() {
		return "eno=" + eno + ", edepno=" + edepno + ", name=" + name;
	}


	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
	
}
