package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOf4Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {2,3,1,0,-4,-1};
		System.out.println(noOfWaysSumIsZero(arr,arr.length));
		System.out.println("\n"+noOfWaysBetter(arr,arr.length));
	}

	static int noOfWaysSumIsZero(int[] arr,int n)
	{
		int noOfWays=0;
		for(int i=0;i<n-3;i++)
		{
			for(int j=i+1;j<n-2;j++)
			{
				for(int k=j+1;k<n-1;k++)
				{
					for(int l=k+1;k<n;k++)
						if(arr[i]+arr[j]+arr[k]+arr[l]==0)
							noOfWays++;
				}
			}
		}
		return noOfWays;
	}
	
	static int noOfWaysBetter(int[] arr, int n)
	{
		int noOfWays=0;
		List<Node> arrList= new ArrayList<>();
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			{
				Node each= new Node();
				each.sum=arr[i]+arr[j];
				each.first=arr[i];
				each.second=arr[j];
				arrList.add(each);
			}
				
		Collections.sort(arrList,(Node n1,Node n2)-> n1.sum<n2.sum?-1:1);
//		Collections.sort(arrList, new Comparator<Node>() {
//	        @Override
//	        public int compare(Node h1, Node h2) {
//	            return h1.sum<h2.sum?-1:1;
//	        }
//	    });
		arrList.forEach(s-> System.out.print(s.sum+ " "));
		int l=0,r=arrList.size()-1;
//		while(l<r) {
//			if(arrList.get(l) == arrList.get(r))
//			{
//				noOfWays++;
//				l++;
//				r--;
//			}
//			else if(arrList.get(l)<arrList.get(r))
//			{
//				
//			}
//		}
		
		while (l < n && r >=0 )
	    {
	        if ((arrList.get(l).sum + arrList.get(r).sum == 0) && hasCommonElements(arrList.get(l), arrList.get(r)) )
	        {
	        	  noOfWays++;
	        	  l++;
	        	  r--;
	        }
	        else if (arrList.get(l).sum < arrList.get(r).sum)
	            l++;
	        else
	            r--;
	    }
		
		
//		for(int i=0;i<n/2;i++)
//			if(arrList.get(i)==arrList.get(n-i))
//				noOfWays++;
		return noOfWays;
	}
	
	static boolean hasCommonElements(Node a, Node b)
	{
		a.print();
		b.print();
		if (a.first == b.first || a.first == b.second ||
	            a.second == b.first || a.second == b.second)
	        return false;
	    return true;
	}

}


class Node{
	int sum;
	int first;
	int second;
	
	void print()
	{
		System.out.println("Node "+sum+" , f = "+first + " s= "+second);
	}
}