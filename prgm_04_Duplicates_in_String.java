package Practice_String;

public class prgm_04_Duplicates_in_String {

	public static void main(String[] args) {
		
		String b="happy";
		char[] a=b.toCharArray();
		boolean[] k=new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
		if(k[i]==false)
		{
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
					k[j]=true;
				}
				
			}
			if(count>1)
			{
				System.out.println(a[i]+" "+count);
			}
		}
				
		
	}
		
	}
}
