package LearningProgramming.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {
	
	static Character[] vowels= new Character[] {'a','e','i','o','u'};
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Set<Character> vowelsSet= new HashSet<>(Arrays.asList(vowels));
		InputStreamReader reader= new InputStreamReader(System.in,StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		
		while((line= in.readLine())!=null)
		{
			System.out.println(line.replaceAll("[aeiouAEIOU]", ""));
			StringBuilder sb= new StringBuilder();
			System.out.println(line);
			for(Character c: line.toCharArray())
			{
				if(!vowelsSet.contains(c))
					sb.append(c+"");
			}
			System.out.println("Result = "+sb.toString());
		}
		
		
	}

}
