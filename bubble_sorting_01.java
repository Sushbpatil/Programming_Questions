package DSA;

import java.util.Arrays;
public class bubble_sorting_01 {

	public static void main(String[] args) {
		
		int [] a= {2,3,5,1,9};
		
		for(int i=0;i<a.length;i++)
		{
			for (int j =i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
