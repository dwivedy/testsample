package sample;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
	
	 

	public static void main(String[] args) {
		 
		
// List<Integer> numbs=Arrays.asList(1,2,null,4,5);
		List<Integer> numbs=Arrays.asList();
 
 
 List<Integer> numbs2=numbs.stream()
 .filter(Objects::nonNull )
 .filter(numb-> numb==6).collect(Collectors.toCollection(ArrayList::new));
 
 
 System.out.println(numbs2);
 
	}
	

	public static void chc(Integer numb) {
		System.out.println("d");
	}
	
}


