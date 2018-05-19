package LearningProgramming.random;
import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray=  new int[] {2,5,4,3,1};
		System.out.println(" Before Sort" +Arrays.toString(inputArray));
		quicksort(inputArray,0,inputArray.length-1);
		System.out.println(" After Sort" +Arrays.toString(inputArray));
	}

	public static void swap(int[] a,int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static int partitionArray(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
	
	private static int partition(int[] a,int left,int right)
	{
		int i=left-1;
		int pivot= a[right];
		for(int j=left;j<right;j++)
		{
			if(pivot>=a[j])
			{
				i++;
				//swap i and j
				swap(a,i,j);
			}
		}
		swap(a,i+1,right);
		return i+1;
	}
	
	private static void quicksort(int[] a, int low, int high)
	{
		if(low<high)
		{
			int pivotIndex= partition(a,low,high);
			quicksort(a,low,pivotIndex-1);
			quicksort(a,pivotIndex+1,high);
		}
	}
}
