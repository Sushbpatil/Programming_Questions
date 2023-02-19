package array_practice;

import java.util.Arrays;

public class arr_21_remove_duplicate {

	public static void main(String[] args) {
		
	
	int [] a= {1,2,3,4,5,6,3};
	System.out.println("Array created "+Arrays.toString(a));
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			
			if(a[i]==a[j])
			{
				a[i]=-1;
			}
		}
			if(a[i]!=-1)
			{
				System.out.print(a[i] + " ");
			}
		
	}
	
	}
}
