package array_practice;

public class arr_12_find_duplicates {

	public static void main(String[] args) {

		int [] a= {2,3,4,1,66,44,9,9};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					
					System.out.println("Duplicate :  "  +a[i]);
				}
			}
		}
		}
	
}
   