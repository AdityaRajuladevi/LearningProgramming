package crackingcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckPairsWithDifferenceK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int k=4;
			int counter=0;
			int[] arr= new int[] {1,4,12,54,2,45,3,6,8,10};
			//ArrayList<Integer> a=(ArrayList<Integer>) Arrays.asList(arr);
			Set<Integer> numbers= new HashSet<>();
			for(Integer j:arr)
				numbers.add(j);
			// Since given elements are distinct, it would only suffice to find if the each value +k exists in the array for which we can use set
			for(Integer i:arr)
			{
				if(numbers.contains(i+k))
					counter++;
			}
		System.out.println(counter);
	}

}
