package LearningProgramming.dynamicprograming;

public class WaysToGetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=343;
		long[] coins=new long[] {1,2,3};
		System.out.println(getWays(n, coins));
	}

	// The logic is that, we start taking each coin and save the ways to get the value from 1 to amount by using that coin ( example if 1 is the first coin that is considered, 
	// then the no of ways of getting any amount say 10 using 1 is only 1 (way) i.e. by using 10 1's. This way after the state of ways obtained by utilizing 1 are found, then the next coin operates on the most recent state
	// which is affected by the previous state.
	public static int getWays(int n, int[] c)
	{
		int[] combinations = new int[n+1];
		combinations[0]=1;
		for (int coin:c)
		{
			for(int i=1;i<=n;i++)
			{
				if(i>=coin)
					combinations[i]+=combinations[i-coin];
			}
			
		}
		return combinations[n];
	}
	
	
	public static long getWays(long n, long[] c)
	{
		long[] combinations = new long[(int) (n+1)];
		combinations[0]=1;
		for (long coin:c)
		{
			for(int i=1;i<=n;i++)
			{
				if(i>=coin)
					combinations[i]+=combinations[(int) (i-coin)];
			}
			
		}
		return combinations[(int) n];
	}
}
