package LearningProgramming.dynamicprograming;

import java.util.Scanner;

/*
Given 3 numbers {1, 3, 5}, we need to tell
the total number of ways we can form a number 'N' 
using the sum of the given three numbers.
(allowing repetitions and different arrangements).
 */
public class TotalNoWays {
 static int[] num = new int[] {1,3,5} ;
 static final int NIL = -1;
 static int lookup[] ;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number = ");
		Scanner sc= new Scanner(System.in);
		int n =  sc.nextInt();
		lookup =  new int[n+1];
		for(int i=0;i<=n;i++)
			lookup[i]=NIL;
		int result = state(n);
		System.out.println("Result of "+n+" = "+result);
		/*
		// define the first few known states
		lookup[1] = 1;
		lookup[2] = 1;
		lookup[3] = 2;
		lookup[4] = 3;
		lookup[5] = 4;
		*/
		
	}
	
	private static int state(int n)
	{
		if (n<0)
			return 0;
		if(n == 0)
			return 1;
		if(lookup[n] == NIL)
		{
				lookup[n] = state(n-1) + state(n-3) + state(n-5);
		}
		return lookup[n];
	}
}
