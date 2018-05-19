package LearningProgramming.dataStructures;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String ar[]) {
		Hashtable<String, Integer> numbers
	     = new Hashtable<String, Integer>();
	   numbers.put("one", 1);
	   numbers.put("one", 2);
	   int c=numbers.get("one");
	   System.out.println(""+c);
	}
}
