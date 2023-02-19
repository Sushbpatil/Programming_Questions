package array_practice;

import java.util.Arrays;

///Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.

public class arr_15_missing_number_in_array {

	public static void main(String[] args) {
		
	
	int [] a= {10,2,7,4,5,3,8,9,1};
	
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	 int n=a.length+1;
	 //Sum of Natural Numbers
	 n=(n*(n+1))/2;

	 int sum=0;
	 for (int i = 0; i < a.length; i++) {
		
		 sum=sum+a[i];
	}
	 
	int  missingNumber= n-sum;
	
	 if(missingNumber>a.length)
	 {
		 System.out.print("No missing Number");
	}
	else if(missingNumber<=a.length+1)
	 {
		 System.out.print("missing number : " + missingNumber);
	 }
	}
}