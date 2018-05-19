package LearningProgramming.dynamicprograming;

import java.util.Arrays;

public class ChangeMaking {

	static int counter=0;
	static int dpCounter=0;
	static int[] states;
	static int[] dpStates;
	static int[] coins;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		states=new int[n+1];
		dpStates= new int[n+1];
		coins = new int[] {1,3,5};
//		states[1]=1;
//		states[2]=2;
//		states[3]=1;
//		states[4]=2;
//		states[5]=1;
		System.out.println(getMinCoins(n));
		System.out.println("Times= "+counter);
		
		System.out.println(dpChangeMaking(n, coins));
		System.out.println("DP Times= "+dpCounter);
		System.out.println(Arrays.toString(dpStates));
		System.out.println(dpStates[n]);
	}

	
	static int getMinCoins(int n)
	{
		counter++;
		if(states[n]!=0)
			return states[n];
		else
		{
			int min=n;
			for(int c: coins)
			{
				if(n>=c) {
					int k= 1+getMinCoins(n-c);
					if(k<min)
						min=k;
				}
			}
			states[n]=min;
			return min;
		}
		
	}
	
	static int dpChangeMaking(int n, int[] coins)
	{
		dpCounter++;
//		if(dpStates[n]!=0)
//			return dpStates[n];
		for(int i=1;i<n+1;i++)
		{
			int min =i;
			for(int coin:coins)
			{
//				if(i==coin)
//				{
//					min=1;
//					continue;
//				}
					
				if(i>=coin) {
					
					int k=1+dpStates[i-coin];
					if(k<min)
						min=k;
				}
			}
			dpStates[i]=min;
		}
		
		return dpStates[n];
	}
}

