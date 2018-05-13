package sorting;

import java.util.Arrays;
import java.util.Random;

public class InsertionSorting {

	static int[] ARR= new int[]{1,7,5,6,6,4,5};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Sorting : "+ Arrays.toString(ARR));
		insertionSort(ARR);
		System.out.println("After Sorting : "+ Arrays.toString(ARR));
		int[] randArray= new Random().ints(10, 1, 100).toArray();
		System.out.println("Before Sorting : "+ Arrays.toString(randArray));
		insertionSort(randArray);
		System.out.println("After Sorting : "+ Arrays.toString(randArray));
		
	}
	
	public static void swap(int[] a, int i, int j)
	{
		int t = a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
	public static void insertionSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=current;	
		}
	}
}
