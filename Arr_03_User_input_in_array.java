package array_practice;

import java.util.*;
public class Arr_03_User_input_in_array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the Array : ");
		int size = sc.nextInt();
		int count=0 ;
		int [] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			
			System.out.print("Enter elements:");
			a[i]=sc.nextInt();
			count++;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("");
		
		System.out.println(Arrays.toString(a));
		System.out.println("Count is "+count);
	}
}
