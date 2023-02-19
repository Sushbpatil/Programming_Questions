package array_practice;

import java.util.*;


public class arr_20_Array_to_list {

	public static void main(String[] args) {
		
		String [] a= {"Hi","Bye","Ki"};
		
		System.out.println("Array :"+Arrays.toString(a));
		
		List<String> b=Arrays.asList(a);
		
		System.out.println("List using Arrays.asList() : "+b);
		
		List <String> c=new ArrayList<String>();
	    Collections.addAll(c, a);
		
		System.out.println(" List Using Collections.addAll : "+ c);
		
		
		for (String string : a) {
			c.add(string);
		}
		System.out.println("List Using ForEach : "+ c);
	}
}
