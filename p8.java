package array_practice;

public class p8 {

	public static void main(String[] args) {
		
		
		int [] a= {1,2,3,4,5,6,1,2,3};

		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
			if(a[i]!=-1)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}
}
