package com.nt;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassA {

	public static void main(String[] args) {


		String s= "jhanuhg";
		
		//s.chars().mapToObj(m->String.valueOf((char)m)).filter(data->data.matches("[^aeiou]")).collect(Collectors.toList()).forEach(System.out::println);;
		
		
		String s1="23405204506";
		
		Collection<List<Character>> m1=s1.chars().mapToObj(m->(char)m).collect(Collectors.partitioningBy(n->!n.equals('0'))).values();
		//m1.stream().flatMap(m->m.stream()).collect(Collectors.toList()).forEach(System.out::print);
		
		
		Collection<Long> l=s.chars().mapToObj(da->(char)da).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values();
	boolean b=	l.stream().noneMatch(data->data>2);
		//System.out.println(b);
	
	String s3="hdsf6382end";
	
	//s3.chars().mapToObj(m->(char)m).filter(data->Character.isDigit(data)).collect(Collectors.toList()).forEach(System.out::println);;
	
	List<Integer> l1=Arrays.asList(10,20,30,40,13);
	List<Integer> l2=Arrays.asList(10,4,6,2,13);
	l2.stream().filter(data->l1.contains(data)).collect(Collectors.toList()).forEach(System.out::println);
	
	List<String> l3=Arrays.asList("jhanu","sfrh","jshfe","nsdgf","nawf");
	
	Map m=l3.stream().collect(Collectors.groupingBy(data->data.substring(0, 1),Collectors.counting()));
	//System.out.println(m);
	
	String s4="jhagfnn";
	
if(s4.length()%2==0)
{
System.out.println(s4.charAt(s4.length()/2-1));	
}
else
{
	System.out.println(s4.charAt(s4.length()/2));
}
	System.out.println("===================");
	
	List<String> list=Arrays.asList("1hf","u3ywe","43dhs","1her");
	//	list.stream().filter(data->data.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);
	
	String s5="byebyehvdsbyebdbye";
	String s6="bye";
	
	long ab=IntStream.range(0,s5.length()-2).filter(data-> s5.substring(data,data+3).equals(s6)).count();
	//System.out.println(ab);
	
	String s7="i am jhansi";
	
	//s7.chars().mapToObj(m9->String.valueOf((char)m9)).filter(data-> !data.matches(" ")).collect(Collectors.toList()).forEach(System.out::print);
	
	s7.chars().mapToObj(m8->String.valueOf((char)m8)).map(data-> data.replaceAll("a","")).collect(Collectors.toList()).forEach(System.out::print);
	System.out.println("aaaaaa");
	long ab1=s3.chars().filter(data->Character.isDigit(data)).count();
	//System.out.println(ab1);

	String ss1="I am jhansi";
	String arr[]=ss1.split(" ");
	String ss2=Stream.of(arr).max(Comparator.comparing(String::length)).get();
	//System.out.println(ss2);
	
	int ab2=IntStream.range(0, 10).sum();
	
	String ss3="silent";
	String ss4="listen";
	
	boolean bb=ss3.chars().mapToObj(mm1->(char)mm1).sorted().collect(Collectors.toList()).equals(ss4.chars().mapToObj(mm2->(char)mm2).sorted().collect(Collectors.toList()));
	//System.out.println(bb);
	
	int ab3=10234;int sum=0;
	while(ab3>0)
	{
		sum+=ab3%10;
		ab3=ab3/10;
	}
	//System.out.println(sum);
	
	List<Integer> li=Arrays.asList(1,2,4,3,4,5,2,1,1);
	Map<Integer, Long> li2=li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	//System.out.println(li2);
//	Stream<Entry<Integer, Long>> m5=li2.entrySet().stream().sorted(Comparator.comparingLong(Map.Entry<Integer,Long>::getValue).reversed());
//	Iterator m6=m5.iterator();
//	while(m6.hasNext())
//	{
//		//System.out.println(m6.next());
//	}
	
	List<String> l4=Arrays.asList("j","1hfsdsgfc1","3nszgfe","ewf","abf1");
   //  l4.stream().filter(data->data.endsWith("1")).collect(Collectors.toList()).forEach(System.out::println);
	List<Integer> l5=Arrays.asList(101,103,11,134,131);
	//l5.stream().filter(data->data%10==1).collect(Collectors.toList()).forEach(System.out::println);
     	
	//l4.stream().filter(data-> data.matches("([0-9].+)")).collect(Collectors.toList()).forEach(System.out::println);	
	String ss5="jhahhhkahj";
	boolean bb1=IntStream.range(0, ss5.length()-1).allMatch(data-> ss5.charAt(data)==ss5.charAt(ss5.length()-data-1));
	//System.out.println(bb1);	
	String ss7=l4.stream().collect(Collectors.joining(",","[","]"));
	//System.out.println(ss7);
	l4.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()).forEach(System.out::println);
	
	
	}
}