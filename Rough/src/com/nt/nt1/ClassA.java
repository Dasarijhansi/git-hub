package com.nt.nt1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClassA {

	public static void main(String[] args) {
		
		String s="I am jhansi";
		String s1="[aeiou].*";
		String s3=s.chars().mapToObj(m->String.valueOf((char)m)).filter(data->data.matches(s1)).collect(Collectors.joining());
		//System.out.println(s3);
		String s4=s.chars().mapToObj(m->String.valueOf((char)m)).map(data-> data.replaceAll("[aeiou]", "")).collect(Collectors.joining());
		//System.out.println(s4);
		String s5="032043000707";
		Collection<List<Character>> l1=s5.chars().mapToObj(da->(char)da).collect(Collectors.partitioningBy(n->!n.equals('0'))).values();
		//l1.stream().flatMap(da->da.stream()).collect(Collectors.toList()).forEach(System.out::print);;
		List<Integer> l2=Arrays.asList(1,2,3,0,8);
		Collection<Long> l3=l2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values();
		
		boolean b=l3.stream().noneMatch(data->data>=2);
		//System.out.println(b);
		String s6="hds743fd";
		String s7=s6.chars().mapToObj(da->String.valueOf((char)da)).map(data->data.replaceAll("[^a-z]", "")).collect(Collectors.joining());
		//System.out.println(s7);
		List<Integer> l4=Arrays.asList(1,2,3,4,5,6);
		List<Integer> l5=Arrays.asList(1,8,3,0,5,6);
		//l4.stream().filter(da->l5.contains(da)).collect(Collectors.toList()).forEach(System.out::println);
		List<String> l6=Arrays.asList("hdgdg","nszf","dhe","kwrgffvbe","kreds","hrtgt");
		String s8=l6.stream().map(data->data.toUpperCase()).collect(Collectors.joining());
		//System.out.println(s8);
		l6.stream().collect(Collectors.groupingBy(da->da.substring(0, 1),Collectors.counting()));
	    List<Integer> l9=Arrays.asList(1,2,7,5,9,8,3,4);
		int ab=7;
		int ab1=l9.stream().filter(da->da.intValue()<ab).max(Integer::compareTo).get();
		//System.out.println(ab1);
		String s10=l6.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(s10);
		String ss1="listen";
		String ss2="silent";
		boolean b2=ss1.chars().mapToObj(m->(char)m).sorted().collect(Collectors.toList()).equals(ss2.chars().mapToObj(m1->(char)m1).sorted().collect(Collectors.toList()));
		//System.out.println(b2);
		
		int ab2=1451;
		int sum=0;
		while(ab2>0)
		{
			sum+=ab2%10;
		    ab2=ab2/10;
		}
		//System.out.println(sum);
		
		List<String> li1=Arrays.asList("7dg","98fr","sf","oertgfies","hgzsfs","7sgfbfsdfdf");
		List<Integer> li2=Arrays.asList(1,5,2,41,7,61,34);
		//li2.stream().map(da->Integer.valueOf(da)).filter(daa->daa%10==1).collect(Collectors.toList()).forEach(System.out::println);
		//li1.stream().filter(da->da.endsWith("s")).collect(Collectors.toList()).forEach(System.out::println);
        String reg="([0-9].+)";
		//li1.stream().filter(m->m.matches(reg)).collect(Collectors.toList()).forEach(System.out::println);
		
        String s11="jhahhj";
		boolean b11=IntStream.range(0, s11.length()).allMatch(data->s11.charAt(data)==s11.charAt(s11.length()-data-1));
        //System.out.println(b11);
		String s12=li1.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(s12);
	    li1.stream().sorted(Comparator.comparingInt(String::length));
		
	    
	    
	    
		
	}
}