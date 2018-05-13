package sorting;

import java.util.Arrays;
import java.util.Random;

public class Selectionsorting {
	static int[] ARR = new int[] { 1, 7, 5, 6, 6, 4, 5 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Sorting : " + Arrays.toString(ARR));
		selectionSort(ARR);
		System.out.println("After Sorting : " + Arrays.toString(ARR));

		System.out.println("== On Random Array ==");
		int[] randArray = new Random().ints(10, 1, 100).toArray();
		System.out.println("Before Sorting : " + Arrays.toString(randArray));
		selectionSort(randArray);
		System.out.println("After Sorting : " + Arrays.toString(randArray));

	}

	public static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minIndex]>arr[j])
					minIndex=j;
			}
			// swap the minimum value to the i th position
			swap(arr,minIndex,i);
		}
	}
}
