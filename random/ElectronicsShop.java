package random;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ElectronicsShop {

	/*
	10 2 3
	3 1
	5 2 8*/
	
	static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
		Arrays.sort(keyboards);
		Arrays.sort(drives);
		if(keyboards[0]+drives[0]>s)
			return -1;
			
		int maxSpent=0;
		
     
        for(int i = keyboards.length-1, j = 0; i >= 0; i--){
            for(; j < drives.length; j++){
                if(keyboards[i]+drives[j] > s) break; //This prevents j from incrementing
                if(keyboards[i]+drives[j] > maxSpent)
                	maxSpent = keyboards[i]+drives[j];
            }
        }

		/*
		for(int i=keyboards.length-1;i>=0;i--)
		{
			for(int j=0;j<drives.length;j++)
			{
				System.out.println(keyboards[i]+" -- "+ drives[j]);
				int price=keyboards[i]+drives[j];
				if(price==s)
					return price;
				else if(price<s && maxSpent<price)
					maxSpent = price;
				else
					break;		
			}
		} 
		*/
		/*
		int i=keyboards.length-1,j=0;
		while(i>=0 && j<drives.length)
		{
			System.out.println(keyboards[i]+" -- "+ drives[j]);
			int price=keyboards[i]+drives[j];
			if(price==s)
				return price;
			else if(price<s)
			{
				if(maxSpent<price)
				{
					maxSpent=price;
					j++;
				}
				else
				{
					i--;
				}
	
			}
			else
				i--;
			
		}
		*/
		//System.out.printf("Modified arr[] : %s", Arrays.toString(keyboards));
		return maxSpent;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
