package star.pattern;
import java.util.*;

public class Pattern06 {

//	1 
//	2 1 
//	3 2 1 
//	4 3 2 1 
//	5 4 3 2 1

	
	
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i=1; i<=rows; i++)
		{
			for (int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i=1; i<=rows; i++)
		{
			int val =i;
			
			for (int j=1; j<=i; j++) {
				System.out.print(val+ " ");
				val --;
			}
		System.out.println();
		}
	}
}
