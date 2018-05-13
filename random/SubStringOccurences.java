package random;
public class SubStringOccurences {

	private static int subStringOccurences(String str, String substr)
	{
		int count=0;
		for(int i=0;i<str.length()-substr.length()+1;i++)
		{
			int k=substr.length()+i;
			System.out.println(str.substring(i,k));
			if(str.substring(i,k).equalsIgnoreCase(substr) )
			{
				count+=1;
			}
		}
		 return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= " test test test abc test";
		String s2= "test";
		System.out.println("Occurences= "+ subStringOccurences(s1, s2) );
	}

}
