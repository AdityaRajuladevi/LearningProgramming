package dataStructures;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String[]> demoSet= new HashSet<>();
		demoSet.add(new String[] {"John","Demo"});
		demoSet.add(new String[] {"John","Demo"});
		demoSet.forEach(s -> System.out.println(s));
		
		
		Set<String> demoSet2= new HashSet<>();
		demoSet2.add("z");
		demoSet2.add("Demo");
		demoSet2.add("John");
		demoSet2.add("z");
		demoSet2.forEach(s -> System.out.println(s));
		
	}

}
