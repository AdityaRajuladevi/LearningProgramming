package random;
import java.util.Scanner;

public class FactorialDP {
	static final int MAX = 100;
	static final int NIL = -1;
	static int lookup[] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number to find the factorial == ");
		Scanner sc= new Scanner(System.in);
		int n =  sc.nextInt();
		lookup =  new int[n+1];
		for(int i=0;i<=n;i++)
			lookup[i]=NIL;
		int result = fact(n);
		System.out.println("Factorial of "+n+" = "+result);

	}
	
	private static int fact(int n)
	{
		if(lookup[n] ==NIL)
		{
			if (n==1)
				lookup[n]=1;
			else
				lookup[n]=fact(n-1) * n;
		}
		return lookup[n];
		
	}

}
