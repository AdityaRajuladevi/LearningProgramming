package interview;

public class MaxSubArrayContiguous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= new int[] {2,3,-2,4};
		
		//-7,-1,-45,-34,-24,-7
		System.out.println("Max Contiguous Sub Array Sum "+getMaxContiguousSum(array));
		
		System.out.println("Max Contiguous Sub Array Product "+getMaxContiguousProduct(array));
		
		System.out.println(Math.max(-1, -4));
	}

	// The idea is that, the sum of continuous sub array is only good to be propagated when its greater than the value at the current index.
	static int getMaxContiguousSum(int[] arr)
	{
		int maxSum=arr[0];
		int recentSum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			recentSum = Math.max(arr[i], recentSum+arr[i]);
			maxSum=Math.max(recentSum, maxSum);
			//System.out.println(recentSum);
		}
		return maxSum;
	}
	
	static int getMaxContiguousProduct(int[] arr)
	{
		int maxProduct=arr[0];
		int recentProduct =arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			recentProduct = Math.max(arr[i], recentProduct*arr[i]);
			maxProduct=Math.max(recentProduct, maxProduct);
			//System.out.println(recentSum);
		}
		return maxProduct;
	}
	
	
}
