package thirtydaystocode;

import java.util.Scanner;

public class BinaryDay10 {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k=n;
	        StringBuilder sb = new StringBuilder();
	        int loopmaxcount=0;
	        int maxcount=0;
	        String strBinary = Integer.toBinaryString(n);
	        System.out.println(strBinary);
	        System.out.println(Integer.toString(n,2));
	       /* My way
	        *  while(n>0)
	        {
	        		int rem = n%2;
	            sb.append(rem);
	            n=n/2;
	            if(rem==1)
	            {
	            			loopmaxcount+=1;
	            			if(loopmaxcount>maxcount)
		            		{
		            			maxcount = loopmaxcount;
		            		}
	            }
	            	else
	            	{
	            		loopmaxcount = 0;
	            	}
	            		 	 		
	        } */
	        
	        // hacker rank way
	        while(k>0)
	        {
	        		loopmaxcount = ++loopmaxcount *(k%2);
	        		maxcount=Math.max(loopmaxcount, maxcount);
	        		k=k/2;
	        }
	        String binary = sb.reverse().toString();
	        
	        System.out.println(binary);
	        System.out.println(""+maxcount);
	       
	    }
}
