package com.nt;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassD {

	
	public static void main(String[] args) {
		
		List<List<Integer>> list=Arrays.asList(Arrays.asList(10,23,4,2,5,6),Arrays.asList(3,57,3,567,24),Arrays.asList(4,54));
		//list.stream().flatMap(m->m.stream()).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Integer> list1=Arrays.asList(2,4,3,1,6,3,5);
		//list1.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		int ab=list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		//System.out.println(ab);
		int ab1=list1.stream().reduce((a,b)->a+b).get();
		//System.out.println(ab1);
		//list1.stream().sorted((a,b)->a>b?1:a<b?-1:0).collect(Collectors.toList()).forEach(System.out::println);;
		int ab2=list1.stream().filter(data->data%2==0).limit(3).reduce((a,b)->a+b).get();
		//System.out.println(ab2);
		//System.out.println(list1);
		double ab3=list1.stream().mapToInt(data->data.intValue()).average().getAsDouble();
		//System.out.println(ab3);
		int a=list1.stream().max(Integer::compareTo).get();
		//System.out.println(a);
		List<String> l1=Arrays.asList("hdsf","dfr","zsfndf","mhsdf");
		List<String> l2=Arrays.asList("sdg","sajf","rt","th");
		//Stream.concat(l1.stream(),l2.stream()).collect(Collectors.toList()).forEach(System.out::println);
		String s1="I am Jhansi";
		String ab4[]=s1.split(" ");
		String ab5=Stream.of(ab4).collect(Collectors.maxBy(Comparator.comparing(String::length))).get();
		//System.out.println(ab5);
		//Stream.of(ab4).map(data->new StringBuilder(data).reverse()).collect(Collectors.toList()).forEach(System.out::println);
		Map m1=l1.stream().collect(Collectors.toMap(Function.identity(),String::length));
		//System.out.println(m1);
		String s="jhanujh";
		Map<Character, Long> m2=s.chars().mapToObj(m->(char)m).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(m2);
		//m2.entrySet().stream().filter(data->data.getValue()>=2).map(d2->d2.getKey()).collect(Collectors.toList()).forEach(System.out::println);
		String s10=Stream.of(ab4).sorted(Comparator.comparing(String::length)).skip(1).findFirst().get();
		//System.out.println(s10);
		List<Integer> l3=Arrays.asList(1,3,5,7,8,6,3);
		Map m3=l3.stream().collect(Collectors.partitioningBy(n->n%2==0));
		//System.out.println(m3.get(true));
		int a2[]= {1,2,3,4,5};
		int ab6=Arrays.stream(a2).boxed().reduce((aa,b)->aa+b).get();
		//System.out.println(ab6);
		String ss="iamjhansi";
		Map<Character,Long> m5=ss.chars().mapToObj(m->(char)m).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	   char c=m5.entrySet().stream().filter(data->data.getValue()>1).map(da->da.getKey()).findFirst().get();
		//System.out.println(c);
		List<String> ss1=Arrays.asList("hrg","hjesf","45","934","hj4","723v");
		//ss1.stream().filter(data-> data.matches("\\d+")).collect(Collectors.toList()).forEach(System.out::println);
	   int ab7[]= {1,2,3,1,2,4,4};
	   int a4= Arrays.stream(ab7).limit(2).reduce((aa,b)->aa*b).getAsInt();
		//System.out.println(a4);
	  int ab8= IntStream.range(0,ab7.length).filter(data->data%2==0).map(m->ab7[m]).reduce((x, y)->x+y).getAsInt();
		//System.out.println(ab8);
		//Arrays.stream(ab7).boxed().filter(data->data%2==0).collect(Collectors.toList()).forEach(System.out::println);
		String ss2="jjaahssvdfdhhws";
		String ss3=IntStream.range(0, ss2.length()).filter(data->data==0|| ss2.charAt(data)!=ss2.charAt(data-1)).
		mapToObj(da-> String.valueOf((char)ss2.charAt(da))).collect(Collectors.joining());
		//System.out.println(ss3);
		List<Integer> l5=Arrays.asList(1,3,2,5,6,4,2,3);
		Collection<Long> m=l5.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values();
		boolean b=m.stream().anyMatch(da->da>=2);
		//System.out.println(b);
		List<String> l4=Arrays.asList("re","3hgfhhfd","74bf","5hbfd","t");
		//l4.stream().filter(data-> data.matches("[0-9].+")).collect(Collectors.toList()).forEach(System.out::println);
		String s7="jhahhj";
		boolean bb=IntStream.range(0, s7.length()).allMatch(data->s7.charAt(data)==s7.charAt(s7.length()-data-1));
		//System.out.println(bb);
		//l4.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()).forEach(System.out::println);
		String ss7=l4.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(ss7);
		
	}
}
