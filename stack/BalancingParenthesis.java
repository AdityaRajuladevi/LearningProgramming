package stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class BalancingParenthesis {

	static HashMap<Character,Character> parenthesis;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parenthesis = new HashMap<>();
		parenthesis.put('{', '}');
		parenthesis.put('(', ')');
		parenthesis.put('[', ']');
		
		Set k= parenthesis.keySet();
		System.out.println(k.contains('['));
		System.out.println(k);
		
		String s="{(A+B)}(";
		System.out.println(checkParenthesis(s));
	}
	
	static boolean checkParenthesis(String s)
	{
		Stack<Character> stack = new Stack<>();
		for(Character c:s.toCharArray())
		{
			if(c == '{' || c== '(' || c=='[')
				stack.push(c);
			else if (c == '}' || c== ')' || c==']')
			{
				if(stack.isEmpty()) {
					return false;
				}
				else {
					if(stack.pop() == parenthesis.get(c))
						continue;
				}
			}
		}
		return stack.empty()?true:false;
	}
	
}
