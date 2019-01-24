/**
 * abc
 */
package LearningProgramming.test;

import java.util.List;
public class abc {

    static int[] ARR = new int[] { 1, 7, 5, 6, 6, 4, 5 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Sorting : " + Arrays.toString(ARR));
		mergeSort(ARR,0,ARR.length-1);
		System.out.println("After Sorting : " + Arrays.toString(ARR));

		// System.out.println("== On Random Array ==");
		// int[] randArray = new Random().ints(10, 1, 100).toArray();
		// System.out.println("Before Sorting : " + Arrays.toString(randArray));
		// mergeSort(randArray,0,randArray.length-1);
		// System.out.println("After Sorting : " + Arrays.toString(randArray));

    }
    
    static void mergeSort(int[] arr,int l, int r)
    {
        int m =  (l+r)/2;
        if(l<r)
        {
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr,l,m,r);
        }
    }

    static void merge(int[] arr , int l, int m, int r)
    {
        System.out.println("Merging "+ l +" -- m -- "+m + " --r-- "+r);
    }
}