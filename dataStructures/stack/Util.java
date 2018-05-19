package LearningProgramming.dataStructures.stack;

public class Util {
	static int performOperation(int op1, int op2, String operator)
	{
		int result=0;
		switch(operator) {
		case "*" : result = op1*op2;
					break;
		case "/" : result = op1/op2;
		break;
		
		case "+" : result = op1+op2;
		break;
		
		case "-" : result = op1-op2;
		break;
				
		case "^" : result = (int)Math.pow(op1, op2);
		break;
		}
		return result;
	}
	
	
	
}
