package LearningProgramming.random;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;



public class RemoveDuplicatesInplace {

    public static void main(String ar[])
    {
        int[] arr= new int[] {0,0,1,1,1,2,2,3,3,4};
        int n= arr.length;
        int i=0;
        int j=0; // used to track the last seen unique integer
        while(i<n-1)
        {
        	if(arr[i]==arr[i+1])
        	{
        		i++;
        	}
        	else{
            	
        		i=i+1; // increment to make it point to the next element
        		j++;
        		if(j!=i)
        			arr[j]=arr[i];
        	}

        }
        for(int k=0;k<=j;k++)
        	System.out.println(arr[k]);
    }
}
