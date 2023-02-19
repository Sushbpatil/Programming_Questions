package array_practice;

import java.util.Arrays;
import java.util.Iterator;

public class arr_08_add_element_at_random {

	public static void main(String[] args) {

		int [] a= {4,3,66,77,2,3,0};
		
		int index=9;
		int element=33;
		System.out.println(Arrays.toString(a));
		a=add(a,index,element);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] add(int[]a ,int index,int element)
	{
		int [] b= new int [a.length+1];
		
		if(index>a.length || index<0)
		{
			System.out.println("Index out of Bound");
			return a;
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if(i<index)
			{
				b[i]=a[i];
			}
			else
			{
				b[i+1]=a[i];
			}
		}
		
		b[index]=element;
		return b ;
	}
	

}
