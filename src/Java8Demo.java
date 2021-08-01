import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> hostingProviders = Arrays.asList("Bluehost",
                "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow");
 System.out.println("list: " + hostingProviders);

 Map<String, Integer> cards2Length = hostingProviders.stream()
         .collect(Collectors.toMap(Function.identity(),
                         String::length,
                         (e1, e2) -> e1,
                         LinkedHashMap::new));
 System.out.println("map: " + cards2Length);
	}

}
