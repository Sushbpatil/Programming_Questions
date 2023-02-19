package array_practice;

import java.util.Arrays;

public class Arr_01_Print_all_elements {

	public static void main(String[] args) {
		
		//Array creating using array Literal
		int [] a= {1,2,3,4,5,6};
		
		//Printing the array using For loop
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		//Printing the Array using Arrays.toString Method
		System.out.print(Arrays.toString(a));
		
	}
}
