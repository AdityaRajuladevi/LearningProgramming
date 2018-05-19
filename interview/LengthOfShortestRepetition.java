package LearningProgramming.interview;

public class LengthOfShortestRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[] {"abcabcabcabc","bcbcbcbcbcbcbcbcbcbcbcbcbcbc","adcdefg"};
		for(String k:s)
		System.out.println(shortRepeat(k));
	}

	static int shortRepeat(String s)
	{
		for(int i=1;i<s.length();i++)
		{
			if(s.length()%i==0)
			{
				String subString = s.substring(0, i);
				if(s.matches("("+subString+")+"))
					return i;
			}
		}
		return s.length();
	}
	
}
