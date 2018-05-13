package sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSorting {
static int[] ARR= new int[]{1,7,5,6,6,4,5};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Sorting : "+ Arrays.toString(ARR));
		bubbleSort(ARR);
		System.out.println("After Sorting : "+ Arrays.toString(ARR));
		
		System.out.println("== On Random Array ==");
		int[] randArray= new Random().ints(10, 1, 100).toArray();
		System.out.println("Before Sorting : "+ Arrays.toString(randArray));
		bubbleSort(randArray);
		System.out.println("After Sorting : "+ Arrays.toString(randArray));
		
	}
	
	public static void swap(int[] a, int i, int j)
	{
		int t = a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
	public static void bubbleSort(int[] arr)
	{
		
		for (int i = 0; i < arr.length-1; i++) {
			int totalSwaps=0;
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
					totalSwaps+=1;
				}
			}
			if(totalSwaps==0)
				return;
				
		}
	
	}
}
