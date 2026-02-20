package z1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.nt.Employee;

public class ClassB {

  public static void main(String[] args) {
	
	  ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("jhan","hbsf",101,10,1000));
		al.add(new Employee("hbfs","dww",104,10,4000));
		al.add(new Employee("mesgf","er",103,20,2000));
		al.add(new Employee("khwc","hbsmff",102,30,3000));
		al.add(new Employee("khwc","hbsmff",102,30,1000));

    al.stream().collect(Collectors.groupingBy(Employee::getEdepno,Collectors.maxBy(Comparator.comparing(Employee::getSal)))).forEach((a,b)->System.out.println(a+" "+b.get().getFname()));
		
}
}
