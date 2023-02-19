package DSA;

//WAP to perform Linear Search
/*
 * Best case = O(1) --> Search element is found at 0th Index(1st value)
 * Worst Case = O(n) --> Searching element is found at last index or element is not present in array or List
 * */

import java.util.*;

public class Linear_Searching_01 {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5,77};
		Scanner sc=new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		System.out.print("Enter the element which you want to search : ");
		int search=sc.nextInt();	
		boolean b=false;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println("Element is present at index : " +  i);
				b=true;
				break;
			}
		}
		if(b==false)
		{
			System.out.println("Element is not Present in Array");
		}
			
	}

}
