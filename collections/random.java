/**
 * random
 */
public class random {

    public static void main(String[] args) {
        
    }

    public static void swap(int[] a, int i, int j)
	{
		int t = a[i];
		a[i]=a[j];
		a[j]=t;
	}
    
     static void bubbleSort(int[] a)
    {   
        int n= ar.length();
        for(int i=0;i<n-1;i++)
        {
            int totalSwap=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    totalSwap++;
                    swap(a, i, j);
                }
            }
            if(totalSwap==0)
            return;
        }

    }
}