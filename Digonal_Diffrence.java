package array_practice;

public class Digonal_Diffrence {

	public static void main(String[] args) {
	int [] [] a= {{1,2,3},{4,5,6},{4,8,9}};
	int sum1=0;
	int sum2=0;
	int digonalD=0;
	for (int i = 0; i < a.length; i++) {
		
		for (int j = 0; j < a.length; j++) {
			if(i==j)
			{
				sum1=(a[i][j])+sum1;
			}
			if(i+j==2)
			{
				sum2=(a[i][j])+sum2;
			}
		}
	}
	System.out.println("Sum of 1st digonal Elements is : "+sum1);
	System.out.println("Sum of 2nd digonal Elements is : "+sum2);
	if(sum1>sum2)
	{
		digonalD=sum1-sum2;
	}
	if(sum1<sum2)
	{
		digonalD=sum2-sum1;
	}
	System.out.println("Diffrence of digonal addition is: "+digonalD);
	
	}

}
