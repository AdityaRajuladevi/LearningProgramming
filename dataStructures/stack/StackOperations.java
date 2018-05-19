package LearningProgramming.dataStructures.stack;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		pushElements(stack);
		int k=stack.pop();
		System.out.println(k+ " Removed");
		System.out.println(stack.peek() +" Peek ");
		System.out.println(stack.peek() +" Peek ");
		
		System.out.println(reverseString("HellhoMaster"));
	}

	
	static void pushElements(Stack<Integer> stack)
	{
		for (int i = 0; i < 5; i++) {
			stack.push(i+1);
		}
	}
	
	
	static String reverseString(String s)
	{
		Stack<Character> stack = new Stack<>();
		for(char c: s.toCharArray())
		{
			stack.push(c);
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty())
			sb.append(stack.pop());
		return sb.toString();
	}
}
