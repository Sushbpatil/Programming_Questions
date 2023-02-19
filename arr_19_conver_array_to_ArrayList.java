package array_practice;

import java.util.*;

public class arr_19_conver_array_to_ArrayList {

	public static void main(String[] args) {
		
		List <Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		System.out.println("ArrayList :"+ a);
		
		Object [] i =a.toArray();
		System.out.println("Array"+Arrays.toString(i));
		Integer [] b=new Integer[a.size()];
		
		b=a.toArray(b);
		
		System.out.println("Array : "+ Arrays.toString(b));
		
	}
}

