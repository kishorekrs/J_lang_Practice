import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<>();
		lst.add("Hello");
		lst.add("Welcome");
		lst.add("London");
		lst.add("Mirchi");
//		System.out.println(lst);
		
//		Long l = lst.stream().filter(s->s.startsWith("M")).count();
//		System.out.println(l);
//		Long l = lst.stream().count();
//		System.out.println(l);
//		System.out.println(lst.size());
		
		long d =  Stream.of("Ajay","Ajith","Karthick","Arjun","Shyam","Don","George").filter(s->{
			s.startsWith("A");
			return true;		
			}).count();
		System.out.println(d);
		
//		prints the count 
		long m =  Stream.of("Ajay","Ajith","Karthick","Arjun","Shyam","Don","George").filter(s->s.length()<5).count();
		System.out.println(m);
//		prints the name of arraylist
		Stream.of("Ajay","Ajith","Karthick","Arjun","Shyam","Don","George").filter(s->s.length()<5).forEach(s->System.out.println(s));
//		limit the output
		Stream.of("Ajay","Ajith","Karthick","Arjun","Shyam","Don","George").filter(s->s.length()<5).limit(1).forEach(s->System.out.println(s));
		System.out.println("=================================================================");
//		map the filter
		Stream.of("Ajay","Ajith","Karthick","Arjun","Shyam","Don","George").filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("=================================================================");
//		sorting the list
		Stream.of("Ajay","Ajith","Karthick","Arjun","Shyam","Don","George").filter(s->s.length()>4).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("=================================================================");
//		Merging two list
		List<String> lst2 =  Arrays.asList("Ajay","Ajith","Karthick","Arjun","Shyam","Don","George");
		Stream<String> newStream = Stream.concat(lst.stream(), lst2.stream());
//		newStream.sorted().forEach(s->System.out.println(s));
		List<String> newList = newStream.collect(Collectors.toList());
		System.out.println(newList);
		System.out.println("=================================================================");
//		anymatch
//		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("karthick"));
		boolean flag = newList.stream().anyMatch(s->s.equalsIgnoreCase("karthick"));
		System.out.println(flag);
		System.out.println("=================================================================");
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		values.stream().distinct().forEach(s->System.out.println(s));
		System.out.println(values);
		List<Integer> newvalues = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newvalues);
	}
}
	
	


