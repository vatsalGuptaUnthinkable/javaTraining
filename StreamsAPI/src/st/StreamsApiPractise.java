package st;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApiPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("is it working? ");
		
				
		String[] names = new String[]{"Vatsal" , "Gupta"}; 
		Stream<String> st = Stream.of(names);
		st.forEach(e ->{
			if(e.length() > 5) {
				System.out.println(e + " The length is greater than 5");
			}else {
				System.out.println(e + " The length is not greater than 5");
			}
			
		});
		
		
	}

}
