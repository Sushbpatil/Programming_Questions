package array_practice;

public class arr_18_sum_of_all_values {

	public static void main(String[] args) {
		
	
	int [] a= {2,3,1,5,3,9};
	
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		
		sum=sum+a[i];
	}
	System.out.println(sum);
}

}