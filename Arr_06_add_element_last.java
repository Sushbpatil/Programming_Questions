package array_practice;

import java.util.Arrays;

public class Arr_06_add_element_last {
public static void main(String[] args) {
	int [] a= {1,2,3,4};
	int element=8;
	System.out.println(Arrays.toString(a));
	a=add(a,element);
	System.out.println(Arrays.toString(a));
	
}

public static int[] add(int[] a, int element) {
	
	int [] b= new int [a.length+1];
	
	for (int i = 0; i < a.length; i++) {
		
		b[i]=a[i];
		
	}
	b[b.length-1]=element;
	
	return b;
	
}
}
