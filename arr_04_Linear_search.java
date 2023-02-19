package array_practice;

//CREATE ARRAY A WHICH HAVING ELEMENTS N. FIND THE X ELEMENT USING LINEAR SEARCH

import java.util.*;
public class arr_04_Linear_search {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int[] a= {11,22,33,12,32,44,56,99};
	System.out.println(Arrays.toString(a));
	System.out.println("Enter Element you want to search");
	int x=sc.nextInt();;
	boolean b=false;
	
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]==x)
		{
			System.out.println("Element Found at Index :" + i);
			b=true;
			break;
		}
		
	}
	if(b==false)
	{
		
		System.out.println("Element is not Present in the Array");
	}
	
	
	
}
}