
package DSA;

import java.util.Arrays;

public class insertion_sort_01 {

	public static void main(String[] args) {
		
		int [] a= {2,5,4,1,3,8};
		
		for (int i = 0; i < a.length; i++) {
			
			int temp=a[i];
			int j=i;
			
			while(j>0 && a[j-1]>temp )
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
   }
}
