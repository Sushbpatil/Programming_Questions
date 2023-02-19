package array_practice;
//13)WAP to find the duplicate values of an array of char values.
public class arr_13_Duplicate_string {

	public static void main(String[] args) {
		
		char [] i = {'a','k','r','s','p','a','k'};
		
		for (int j = 0; j < i.length; j++) {
			for (int j2 = j+1; j2 < i.length; j2++) {
				
				if(i[j]==i[j2])
				{
					System.out.println(i[j]);
				}
			}
		}
	}
	
}
