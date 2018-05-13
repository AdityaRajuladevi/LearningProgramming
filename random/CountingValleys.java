package random;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// sample input 
//8
//UDDDUDUU


public class CountingValleys {
	static int countingValleys(int n, String s) {
        // Complete this function
		int[] steps = new int[n];
		s=s.toUpperCase();
		for(int i=0;i<n;i++)
		{
			char c= s.charAt(i);
			if(c=='U')
				steps[i]=1;
			else
				steps[i]=-1;
		}
		/*for(int i:steps)
			System.out.println(" "+ i);*/
		int currentStepCount=0;
		int valleyCount=0;
		for(int i=0; i<n ; i++)
		{
			currentStepCount+=steps[i];
			// check for valley
			if(currentStepCount == 0 && steps[i]==1) 
			{
				valleyCount+=1;
			}
			
		}
		return valleyCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
