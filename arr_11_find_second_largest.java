package array_practice;

public class arr_11_find_second_largest {

	public static void main(String[] args) {
		int [] a= {79,2,32,78,45,77,44,76};
		
		int slarge=Integer.MIN_VALUE;
		int large=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>large)
			{
				large=slarge;
				large=a[i];
			}
			else if(a[i]>slarge && a[i]!=large)
			{
				slarge=a[i];
			}
		}
		System.out.println(slarge);
	}
}
