package array_practice;

public class arr_10_find_largest_in_array {

	public static void main(String[] args) {
		
		int[] a= {72,34,11,66,997,5,31,22};
		
		
		//-2147483648 [0x80000000]
		
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The max value in array : "+ max);
	}
}
