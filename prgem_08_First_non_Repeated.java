package Practice_String;

public class prgem_08_First_non_Repeated {

	public static void main(String[] args) {
		
		String sr="susukopk";
		
		char [] a=sr.toCharArray();
		boolean b[] =new boolean [a.length];
		
		for (int i = 0; i < b.length; i++) {
			
			if(b[i]==false)
			{
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
						
					}
					
				}
				if(count==1)
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
