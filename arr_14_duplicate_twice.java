package array_practice;

import java.util.Iterator;

// There is an array with every element repeated twice except one.Find that element?
public class arr_14_duplicate_twice {

	public static void main(String[] args) {
		int [] a= {1,2,33,1,33,98,1,98,98};
		
		int temp=0;
		int temp2=0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					temp=a[i];
				}
				for (int j2 = j+1; j2 < a.length; j2++) {
					if(temp==a[j2])
					{
						 temp2=a[j2];
						 
					}
				}
			}
			 
		}
		System.out.println(temp2);
		
	}
}
