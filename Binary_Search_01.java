package DSA;

import java.util.*;
//WAJp  Array having N  elements search X 
public class Binary_Search_01 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		int [] N= {1,2,3,4,5,6};
	    System.out.println(Arrays.toString(N));
	    System.out.print("Enter Element to search :");
	    int X=sc.nextInt();
	    
	   int sp=0;
	   int ep=N.length-1;
	   int mp=(sp+ep)/2;
	   
	    while(sp<=ep) {
			if(X==N[mp])
			{
				System.out.print("Element Found at index :"+mp );
				break;
			}
			else if(X>N[mp])
			{
				sp=mp+1;
			}
			else if(X<N[mp])
			{
				ep=mp-1;
			}
			
			mp=(ep+sp)/2;
		}
	    
	    if(sp>ep)
	    {
	    	System.out.println("Element is Not present in Array");
	    }
	}

}
