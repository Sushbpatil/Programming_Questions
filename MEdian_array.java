package array_practice;

import java.util.*;

public class MEdian_array {

	public static void main(String[] args) {
		
	
	System.out.print("Enter size of Array: ");
	Scanner sc = new Scanner(System.in);
	int size=sc.nextInt();
	int [] ar=new int[size];
	
	for (int i = 0; i < ar.length; i++) {
		System.out.print("Enter Element:");
		ar[i]=sc.nextInt();
	}
	
	System.out.println(Arrays.toString(ar));
	double median=0;
	int n=ar.length;
	int sum=0;
	if(n%2!=0)
	{
		median=ar[n/2];
	}
	else if(n==2)
	{
	    sum=ar[0]+ar[1];
	    median=sum/2;
	}
	else if(n%2==0)
	{
		median=(ar[n/2]+ar[(n/2)+1]/2);
		median=median/2;
	}
	System.out.println(median);
}
}
