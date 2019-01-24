import java.util.Arrays;
import java.util.Random;

/**
 * demo
 */
public class demo {

    static int[] ARR = new int[] { 1,4,2,5,3 };

    public static void main(String[] args) {
        System.out.println("Before Sorting : " + Arrays.toString(ARR));
        //mergeSort(ARR,0,ARR.length-1);
        quickSort(ARR,0,ARR.length-1);
        //int p =partition(ARR, 0, 4);
        //System.out.println("Partition "+ p);
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
        //System.out.println("Sort "+ l +" -- m -- "+m + " --r-- "+r);
        if(l<r)
        {
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr,l,m,r);
        }
    }

    static void merge(int[] arr , int l, int m, int r)
    {
        int lLen=m-l+1;
        int rLen=r-m;
        int[] lArray = new int[lLen];
        int[] rArray = new int[rLen];
        for (int i=0;i<lLen;i++)
        {
            lArray[i]=arr[l+i];
        } 
        for (int i=0;i<rLen;i++)
        {
            rArray[i]=arr[m+i+1];
        } 
        int i=0,j=0,k=l;
        while(i<lLen && j<rLen)
        {
            if(lArray[i]<rArray[j])
            {
                arr[k]=lArray[i];
                i++;
            }
            else{
                arr[k] = rArray[j];
                j++;
            }
            k++;
        }

        while(i<lLen)
        {
            arr[k]=lArray[i];
            i++;
            k++;
        }

        while(i<rLen)
        {
            arr[k]=rArray[j];
            j++;
            k++;
        }
       // System.out.println("Merging "+ l +" -- m -- "+m + " --r-- "+r);
    }

    static void swap(int[] arr, int a, int b)
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    static void quickSort(int[] arr, int l, int r)
    {
        if(l<r)
        {
            int p = partition(arr, l, r);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, r);
        }
        

    }

    static int partition(int[] arr, int l, int r)
    {
        int pivot = arr[r];
        int pIndex = l-1;
        for(int i=l;i<r;i++)
        {
            if(pivot>=arr[i])
            {
                swap(arr,i,++pIndex);
            }
        }
        swap(arr,++pIndex,r);
        return pIndex;
    }

    static int partition1(int[] a,int left, int right)
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
}