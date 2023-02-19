package array_practice;

import java.util.Arrays;

public class arr_07_Add_element_at_first {

	public static void main(String[] args) {
	int [] a= {5,3,4,8};
	int element=9;
	System.out.println(Arrays.toString(a));
	a=add(a,element);
	System.out.println(Arrays.toString(a));
}
	public static int[] add(int [] a , int element)
	{
		int [] b =new int [a.length+1];
		
		for(int i=0;i<a.length;i++)
		{
			b[i+1]=a[i];
		}
		b[0]=element;
		
		return b;
	}
	
}


