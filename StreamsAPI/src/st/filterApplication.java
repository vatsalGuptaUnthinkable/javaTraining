package st;

import java.util.List;
import java.util.stream.*;

public class filterApplication {

	public static void main(String[] args) {
		List<Integer> lt  = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> even = lt.stream().filter(i -> (i%2 == 0)).collect(Collectors.toList());
		System.out.println(even);

		List<String> cities = List.of("Kanpur" , "Lucknow", "Delhi");
		List<String> nameWithStartK =  cities.stream().filter(e -> (check(e))).collect(Collectors.toList());
		System.out.println(nameWithStartK);
	}
	//Doubt 
public static boolean check(String e) {
	{
		if(e.startsWith("K")) {
			return true;
		}else {
			return false;
		}
	}
}
}
