package LearningProgramming.thirtydaystocode;
import java.io.*;
import java.util.*;
public class Day6Strings {
	
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();
	        String[] arr= new String[n]; 
	        for(int i=0;i<n;i++)
	        	arr[i]=sc.next();
	        
	        
	        for(String s:arr)
	        {
	        		StringBuilder evenSb = new StringBuilder();
	        		StringBuilder oddSb = new StringBuilder();
	        		
	        		for(int i=0;i<s.length();i++)
	        		{
	        			if(i%2==0) // If even index
	        			{
	        				evenSb.append(s.charAt(i));
	        			}
	        			else
	        				oddSb.append(s.charAt(i));
	        		}
	        		System.out.println(evenSb.toString()+" "+oddSb.toString());
	        }
	    }

}
