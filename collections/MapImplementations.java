package LearningProgramming.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapImplementations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map= new HashMap<>();
		fillData(map);
		map.forEach((k,v) -> System.out.println("Key :"+k + "- Value :"+v));
		
		System.out.println("==== Sorting ====");
		
		for(Entry<String,String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
		
		System.out.println("==== Using Entry set to Access elements ====");
		
		Map<String,String> res=map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal)->oldVal,LinkedHashMap::new));
		res.forEach((k,v)-> System.out.println(k+" : "+v));
			
		
		Map<String,Integer> m=createMap();
		System.out.println(m.getOrDefault("iOS", 0));
		 m.put("VueJs", 1 + m.getOrDefault("VueJs", 0));
		 
		 m.computeIfAbsent("SpringBoot", it->10);
		 
		 m.forEach((k,v) -> System.out.println(k+" : "+v));
		 
		 Map result = map.entrySet().stream()
					.sorted(Map.Entry.comparingByKey()) 			
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
					(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		 
		 
		 Map sortedMap= map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				 .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue)-> oldValue,LinkedHashMap::new));
	}
	

	static void fillData(Map<String, String> map) {
		map.put("Android", "Mobile");
		map.put("Eclipse IDE", "Java");
		map.put("Eclipse RCP", "Java");
		map.put("Git", "Version control system");
	}

	private static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Eclipse IDE", 0);
        map.put("Eclipse RCP", 0);
        map.put("Git", 0);
        return map;
    }
}
