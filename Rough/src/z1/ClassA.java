package z1;import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ClassA{

public static void main(String[] args) {
	
	String s="jhanujh";
	
	Map<Character,Long> ma=s.chars().mapToObj(da->(char)da).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
    ma.entrySet().stream().filter(da->da.getValue()<=2).map(m->m.getKey()).collect(Collectors.toList()).forEach(System.out::println);
	
}
}

