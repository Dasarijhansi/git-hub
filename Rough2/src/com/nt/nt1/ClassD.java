package com.nt.nt1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ClassD {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(4, 40);
		hm.put(5, 50);
		
		System.out.println(hm);
		Set es=hm.entrySet();
		Iterator i=es.iterator();
		while(i.hasNext())
		{
		 Entry e=(Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
}
