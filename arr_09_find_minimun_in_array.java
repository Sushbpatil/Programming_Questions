package array_practice;

public class arr_09_find_minimun_in_array {

	public static void main(String[] args) {
		int [] a= {55,33,532,1,2,4};
		
		int min=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("The minimun value in array is: "+min);
	}
}
