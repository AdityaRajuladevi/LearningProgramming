package LearningProgramming.topics;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RecursionDigitSum {

    static int digitSum(String n, int k) {
        // Complete this function
        BigInteger f = new BigInteger("0");
        int rsum=0;
        // calculate the sum of the digits of n
        for(int i=0;i<n.length();i++)
        {
            //rsum+=Integer.parseInt(n.substring(i,i+1));
            f=f.add(new BigInteger(n.substring(i,i+1)));
        }
        //int res=rsum*k;
        BigInteger res=f.multiply(BigInteger.valueOf(k));
        if(res.compareTo(BigInteger.valueOf(9))<0) //base statement
            return superDigit(res.toString());
        else
            //return digitSum(Integer.toString(rsum),k);
            return digitSum(f.toString(),k);
        
        
    }
    
    static int superDigit(String numString)
    {
        int num= Integer.parseInt(numString);
        if(numString.length()==1)
            return num;
        else
        {
            int k=0;
            for(int i=0;i<numString.length();i++)
            {
                k+=Integer.parseInt(numString.substring(i,i+1));
            }
            return(superDigit(Integer.toString(k)));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int k = in.nextInt();
        int result = digitSum(n, k);
        System.out.println(result);
        in.close();
    }
}
