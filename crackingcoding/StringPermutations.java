package LearningProgramming.crackingcoding;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

	// To find permutations, we use backtracking!! Here we have to recursively make calls to get combinations of different characters from he original string
	// For this first decide on to the pattern of chosen and fixing a character and finding all the possible patterns with that chosen pattern, 
	// After all paths of chosen are explore we backtrack, unchose the chosen variable and select another character and proceed.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abcd";
		permute(s);

	}

	static void permute(String s)
	{
		Set<String> exploredSet= new HashSet<>();
		permuteHelper(s, "",exploredSet);
		System.out.println(exploredSet);
	}
	
	static void permuteHelper(String s, String chosen, Set<String> exploredSet)
	{
		if(s.isEmpty())
		{
			//System.out.println(chosen);
			exploredSet.add(chosen); // save in a set to remove duplicates
		}
			
		else
		{
			String temp =s;
			for(int i=0;i<s.length();i++)
			{
				
				// chose 
				chosen=chosen+s.charAt(i);
				s=new StringBuilder(s).deleteCharAt(i).toString();
				//explore
				permuteHelper(s,chosen,exploredSet);
				//unchose
				s=temp;
				chosen=chosen.substring(0, chosen.length()-1);
			}
		}
	}
	
	static Set<String> getPermutationsIterative(String s)
	{
		int n= s.length();
		Set<String> res= new HashSet<>();
		for(int i=0;i<n-1;i++)
		{
			String c=s.substring(i,i+1);
			String remaining= s.substring(0,i)+s.substring(i+1);
			for(int j=0;j<n;j++)
			{
				StringBuilder sb= new StringBuilder(remaining);
				String k=sb.insert(j, c).toString();
				res.add(k);
			}
		}
		return res;
	}
}
