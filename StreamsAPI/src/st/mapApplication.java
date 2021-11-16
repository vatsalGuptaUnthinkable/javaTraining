package st;

import java.util.List;
import java.util.stream.Collectors;

public class mapApplication {

	public static void main(String[] args) {
		List<String> cities = List.of("Kanpur" , "Lucknow", "Delhi");
		List<String> modifiedCityNames = cities.stream().map( e -> convert(e)).collect(Collectors.toList());
		System.out.println(cities);
		System.out.println(modifiedCityNames);
	}

	private static String convert(String e) {
		return "Indian City --> " + e;
	} 

}
