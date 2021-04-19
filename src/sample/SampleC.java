package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SampleC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc def";
		System.out.println(SampleC.reverse(str));
		
	 List<Integer> num=Arrays.asList(1,2,3);
	 List<Integer> num1=Arrays.asList(4,2,6);
	 
	 List<Integer> fl= Arrays.asList(num,num1).stream().flatMap(Collection::stream).collect(Collectors.toList());
	 System.out.println(fl);
	 
	 List<Integer> fls= Arrays.asList(num,num1).stream().flatMap(Collection::stream).collect(Collectors.toCollection(ArrayList::new));
	 System.out.println(fls);
	 
	 num=num.stream().filter(i->i==2).collect(Collectors.toList());
	 
	 
	 
	 System.out.println(num);
	}
	
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		
		return reverse(str.substring(1))+str.charAt(0);
		
	}

}
