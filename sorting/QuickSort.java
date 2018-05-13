package sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	static int[] ARR = new int[] { 1, 7, 5, 6, 6, 4, 5 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Sorting : " + Arrays.toString(ARR));
		quickSort(ARR,0,ARR.length-1);
		System.out.println("After Sorting : " + Arrays.toString(ARR));

		System.out.println("== On Random Array ==");
		int[] randArray = new Random().ints(10, 1, 100).toArray();
		System.out.println("Before Sorting : " + Arrays.toString(randArray));
		quickSort(randArray,0,randArray.length-1);
		System.out.println("After Sorting : " + Arrays.toString(randArray));

	}

    static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
    static void swap(int a, int b)
    {
    	int t=a;
    	a=b;
    	b=t;
    }
    
	static int partition(int[] a,int left, int right)
	{
		int pIndex=left-1;
		int pivot = a[right];
		for (int j=left; j < right; j++) {
			if(pivot>=a[j]) // check if the value at i is < pivot and if true swap it with pIndex and increment pIndex
			{
				pIndex++;
				swap(a,pIndex,j);
				
			} 
		}// After the loop ends, all elements < pivot are to left of pIndex and elements > pivot including pivot are to right of pIndex 
		swap(a,pIndex+1,right);
		return pIndex+1;
	}
	
	

	static void quickSort(int[] a, int l, int r)
	{
		if(l<r)
		{
			int p= partition(a,l,r);
			quickSort(a,l,p-1);
			quickSort(a,p+1,r);
		}
	}
	
}
