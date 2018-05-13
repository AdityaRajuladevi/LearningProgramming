package sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
	static int[] ARR = new int[] { 1, 7, 5, 6, 6, 4, 5 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Sorting : " + Arrays.toString(ARR));
		mergeSort(ARR,0,ARR.length-1);
		System.out.println("After Sorting : " + Arrays.toString(ARR));

		System.out.println("== On Random Array ==");
		int[] randArray = new Random().ints(10, 1, 100).toArray();
		System.out.println("Before Sorting : " + Arrays.toString(randArray));
		mergeSort(randArray,0,randArray.length-1);
		System.out.println("After Sorting : " + Arrays.toString(randArray));

	}
	
	
	public static void mergeSort(int[] a,int l, int r)
	{
		int mid = (l+r)/2; 
		if(l<r)
		{
			mergeSort(a,l,mid);   // Recursively sort the Left Array
			mergeSort(a,mid+1,r); //  Recursively sort the Right Array
			merge(a,l,mid,r);   // merge the two sorted arrays
		}
	}

	public static void merge(int[] a,int l,int m, int r)
	{
		int n1= m-l+1; // length of the left array to be merged , +1 since index starts from 0
		int n2= r-m;  // length of the right array to be merged
		
		int[] left= new int[n1];
		for (int i = 0; i < left.length; i++) {
			left[i]=a[l+i];
		}
		int[] right=new int[n2];
		for (int i = 0; i < right.length; i++) {
			right[i] = a[m+1+i];
		}
		
		int i=0; // to iterate the left array
		int j=0; // to iterate over the right array
		int k=l;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				a[k]= left[i];
				i++;
			}
			else {
				a[k] =right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			a[k++]=left[i];
			i++;
		}
		
		while(j<n2)
		{
			a[k++]=right[j];
			j++;
		}
	}
	
}
