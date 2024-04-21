package star.pattern;
import java.util.*;
	
//	    *
//	   **
//	  ***
//	 ****
//	*****

class Pattern02{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,k;
		for(i = 1; i<= n; i++) {
		for (j=4; j>=i; j--)
			System.out.print(" ");	
		for (k=1; k<= i; k++)
			System.out.print("*");
		System.out.println();	
		}
}}
