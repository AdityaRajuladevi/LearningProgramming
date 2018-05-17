package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveCommonElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= new int[] {1,2,3,4,5};
		int[] arr2= new int[] {3,5,7,8};
		
		Set<Integer> set1= new HashSet<>();
		Set<Integer> set2= new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			set1.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			set2.add(arr2[i]);
		}
		System.out.println(set1);
		System.out.println(set2);
		set1.removeAll(set2);
		System.out.println(set1);
		
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
//		ArrayList<Integer> arr2 = new ArrayList<Integer>();
//		arr1.add(2);
//		arr1.add(1);
//		arr1.add(3);
//		arr2.add(2);
//		arr2.add(3);
//		arr2.add(4);
//		ArrayList<Integer> out = new ArrayList<Integer>(arr1);
//		arr1.removeAll(arr2);
//		arr2.removeAll(out);
//		System.out.print(arr1 +" "+ arr2 + " with size: ");
//		System.out.println(arr1.size() + arr2.size()); 
	}

}
