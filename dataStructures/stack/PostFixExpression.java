package LearningProgramming.dataStructures.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class PostFixExpression {

	static String[] OPERATORS=new String[]{"+","-","/","*","^"};
	static String[] OPEN_PARENTHESIS = new String[] {"{","[","("};
	static String[] CLOSE_PARENTHESIS = new String[] {"}","]",")"};
	static Map<String,Integer> PRECEDENCE_MAP= new HashMap<String,Integer>() {
		{
			put("+", 1);
			put("-", 1);
			put("/", 2);
			put("*", 2);
			put("^", 3);
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Arrays.toString(OPERATORS));
		String s="78 32 + 10 /";
		System.out.println(evaluatePostifix(s));
		System.out.println(checkPrecedence("/", "^"));
		
		System.out.println(generatePostfixWithoutParenthesis("3 * 2 + 4 * 3"));
		System.out.println(generatePostfixWithoutParenthesis("3 * 2 / 2 + 3"));
		System.out.println(generatePostfixWithoutParenthesis("A + B * C - D * E"));
		System.out.println(generatePostfixWithoutParenthesis("A + B * C / D - E"));
		
		System.out.println(generatePostfix("A + B * C / D - E"));
		
		System.out.println(generatePostfix("( A + B ) * ( C + D )"));
		
		System.out.println(generatePostfix("( A + B ) * C"));
		
		Stack<String> st= new Stack<String>();
		if(!st.isEmpty() && st.peek().equals(" ")) {
			System.out.println(" Inside ");
		}
		
	}

	
	public static int evaluatePostifix(String exp)
	{
		Stack<String> stack = new Stack<>();
		Set<String> operatorsSet= new HashSet<>(Arrays.asList(OPERATORS));
		StringTokenizer sk= new StringTokenizer(exp, " ");
		while(sk.hasMoreTokens())
		{
			String c= sk.nextToken();
			if(!operatorsSet.contains(c))
			{
				stack.push(c);
			}
			else {
				int op2 = Integer.parseInt(stack.pop());
				int op1 = Integer.parseInt(stack.pop());
				stack.push(Integer.toString(Util.performOperation(op1, op2, c)));
			}
		}
		return Integer.parseInt(stack.pop());
	}
	
	public static String generatePostfixWithoutParenthesis(String infix)
	{
		StringBuilder res= new StringBuilder();
		Stack<String> stack = new Stack<>();
		Set<String> operatorsSet= new HashSet<>(Arrays.asList(OPERATORS));
		StringTokenizer stk= new StringTokenizer(infix, " ");
		while(stk.hasMoreTokens())
		{
			String c= stk.nextToken();
			if(!operatorsSet.contains(c))
				res.append(c+" ");
			else
			{
				while(!stack.isEmpty() && checkPrecedence(stack.peek(),c))
				{
						res.append(stack.pop()+" ");
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
			res.append(stack.pop()+" ");
		return res.toString().trim();
	}
	
	public static boolean checkPrecedence(String op_stack, String op)
	{
		return PRECEDENCE_MAP.get(op_stack) >= PRECEDENCE_MAP.get(op) ?true:false;
	}
	
	public static String generatePostfix(String infix)
	{
		StringBuilder result = new StringBuilder();
		Set<String> operatorSet= new HashSet<>(Arrays.asList( OPERATORS));
		Set<String> openParenthesisSet= new HashSet<>(Arrays.asList( OPEN_PARENTHESIS));
		Set<String> closeParenthesisSet= new HashSet<>(Arrays.asList( CLOSE_PARENTHESIS));

		Stack<String> stack = new Stack<>();
		StringTokenizer stk = new StringTokenizer(infix," ");
		while(stk.hasMoreTokens())
		{
			String c= stk.nextToken();
			// System.out.println(c);
			if(!operatorSet.contains(c) && !openParenthesisSet.contains(c) && !closeParenthesisSet.contains(c))
			{
				result.append(c+" ");
			}
			else {
				if(openParenthesisSet.contains(c))
				{
					stack.push(c);
				}
				else if(closeParenthesisSet.contains(c))
				{
					while(!openParenthesisSet.contains(stack.peek()))
					{
						result.append(stack.pop()+" "); // keep popping elements until you encounter a closing parenthesis
					}
					stack.pop(); // pop out the most recent closing parenthesis as well;
				}
				else // if operator
				{
					while(!stack.isEmpty() && !openParenthesisSet.contains(stack.peek()) && checkPrecedence(stack.peek(), c))
					{	
								result.append(stack.pop()+" ");
					}
					stack.push(c);	
				}
			}
		}
		
		while(!stack.isEmpty())
			result.append(stack.pop()+" ");
		
		return result.toString().trim();
	}
}
