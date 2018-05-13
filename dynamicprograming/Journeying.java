package dynamicprograming;

import java.util.ArrayList;
import java.util.List;

public class Journeying {

	static int n=2;
	static int max=2;
	static String[] input =new String[]{"2 2 2","2 2 3"};
	static String states[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		states =  new String[max+1][max+1];
		for(int i=0;i<=max;i++)
			for(int j=0;j<=max;j++)
				states[i][j] = "";
		//System.out.println(states[0][0]);	
		getJourneys(input[0]);
		
		for(int i=0;i<=max;i++)
		for(int j=0;j<=max;j++)
		{
			System.out.println(i+","+j+" = "+states[i][j]);
		}
	}

	public static String getJourneys(String S)
	{
		String array1[]= S.split(" ");
		int x = Integer.parseInt(array1[0]);
		int y = Integer.parseInt(array1[1]);
		int k = Integer.parseInt(array1[2]);
		
		for(int i=0; i<=max; i++)
		{
			for(int j=0; j<=max; j++)
			{
				if(i==0 && j==0)
					continue;
				if(j>0 && j<=max) // can move horizontally
				{
					String previousState = states[i][j-1];
					String[] possibilities = previousState.split(" ");
					StringBuilder sb =  new StringBuilder();
					for (String str: possibilities)
					{
						if(str.equals(""))
							sb.append(str+"H");
						else
							sb.append(" "+str+"H");
					}	
					System.out.println(sb.toString());
					states[i][j] = sb.toString();
				}
				
			}
			
			if(i>0 && i<=max) //can move vertically
			{
				String previousState = states[i][i-1];
				String[] possibilities = previousState.split(" ");
				StringBuilder sb =  new StringBuilder();
				for (String str: possibilities)
				{
					if(str.equals(""))
						sb.append(str+"H");
					else
						sb.append(" "+str+"H");
				}	
				System.out.println(sb.toString());
				//states[i][j] = sb.toString();
			}
		}
		return "";
	}
	
}
