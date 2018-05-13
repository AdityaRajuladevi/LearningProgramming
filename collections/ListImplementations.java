package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListImplementations {
	private static List<String>  createList() {
        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
    }
	public static void main(String[] ar)
	{
		List<String> list= createList();
		list.forEach(s-> System.out.println(s));
		
		System.out.println("=========");
		// Normal sort
//		list.sort(null);
//		list.forEach(s-> System.out.println(s));
		
		// sort with a comparator
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareToIgnoreCase(o2);
			}
		});
		
		list.forEach(s-> System.out.println(s));
		System.out.println("=========");
		
		
		// sort with comparator using lambda
		List<String> ls= createList();
		ls.sort((s1,s2) -> s1.compareTo(s2));
		ls.forEach(s-> System.out.println(s));
		
		// Sort with Arrays.sort method
		String[] ls2= (String[]) createList().toArray();
		Arrays.sort(ls2,(s1,s2) -> s1.compareTo(s2));
		System.out.println(Arrays.toString(ls2));
		
	}
	
	
	
}
