package com.nt.nt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassC {

	
	public static void main(String[] args) {
		
		ArrayList<Employe> al=new ArrayList<Employe>();
		al.add(new Employe(101,10,"hass"));
		al.add(new Employe(103,20,"fdfdgdfg"));
		al.add(new Employe(105,10,"rgd"));
		al.add(new Employe(106,40,"ds"));
		al.add(new Employe(102,20,"heqrass"));
		
		Collections.sort(al);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
