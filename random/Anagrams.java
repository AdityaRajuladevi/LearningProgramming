package LearningProgramming.random;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagrams {
	public static int numberNeeded(String first, String second) {
        HashMap<Character,Integer> cMap = new HashMap();
        for(int i=0; i<first.length();i++) 
        {
        	char s=first.charAt(i);
            if(cMap.containsKey(s))
                cMap.put(s,cMap.get(s)+1);
            else
                cMap.put(s,1);
        }
        
        for(int i=0; i<second.length();i++)
        {
        	char s=second.charAt(i);
            if(cMap.containsKey(s))
                cMap.put(s,cMap.get(s)-1);
            else
                cMap.put(s,1);
        }
        
        int toRemove=0;
        for(Map.Entry<Character, Integer> entry : cMap.entrySet() )
        {
        	toRemove+=Math.abs(entry.getValue());
        }
        return toRemove;
    }
	
	
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
