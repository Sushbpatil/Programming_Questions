package Practice_String;

import java.util.Scanner;

public class prgm_03_seperate_char_ {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.next();
		String var="";
		String num="";
		int num1=0;
		String alph="";
		String vowel="";
		String conson="";
		String Even="";
		String Odd="";
		int zero=0;
		int Esum=0;
		int Osum=0;
		for (int i = 0; i <s.length(); i++) {
			
			if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				var=var+s.charAt(i);
				
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='o')
				{
					vowel=vowel+s.charAt(i);
				}
				else {
					conson=conson+s.charAt(i);
				}
			}
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			    num1= Integer.parseInt(num);
			 
			    for (int j = 0; j < 9; j++) {
					
					int d=num1%10;
					
					if(d%2==0)
					{
						Esum=Esum+d;
						Even=d+Even;
					}
					else if(d%2!=0)
					{
						Osum=Osum+d;
						Odd=Odd+d;
					}
					else {
						zero++;
					}
					num1=num1/10;
				
				}
			}
			else  {
				alph=alph+s.charAt(i);
			}
			
		}
		System.out.println("String :"+ s);
		System.out.println("Variable: "+var);
		System.out.println("Numbers : "+num);
		System.out.println("Alphabates : "+alph);
		System.out.println("Vowels Present in String :"+ vowel);
		System.out.println("Consonant Present in String :"+ conson);
		System.out.println("even Numbers Present in String :"+ Even);
		System.out.println("Odd Numbers Present in String :"+ Odd);
		System.out.println("Zeroes Present in String :"+ zero);
		
		
		
		
	}
}
