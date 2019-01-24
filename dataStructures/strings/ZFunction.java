import java.util.Arrays;

/**
 * ZFunction 
 * This function calculates an array of size 'n' where z[i] is equal to the longest common prefix of S to the sub string starting at i.
 * 
 * In this algorithm, the hack is to have a segment reference [l,r] available (which is the most recent matched substring, which can be used to have a control over the string scanning.)
 * 
 * In simple terms if the 'i' for which we need to calculate the z[i] is in the range of [l,r] then instead of computing the traditional prefix match, we can initialize the z[i] to a value which we are sure of.
 * 
 * i.e z[i] = min( z[i-l],r-i+1 (this check is needed to ensure, we dont initialize the value to unscanned string))
 * 
 * Reference link : https://www.hackerrank.com/challenges/string-similarity/topics/suffix-array 
 * 
 * Time complexity: O(n).
 */
public class ZFunction {

    public static void calculateZ(int[] z,String s)
    {
        int n =  s.length();
        int l=0,r=0;
        z[0]=0;
        for (int i = 1; i < n; i++) {
            if(i<=r)
            {
                z[i] = Math.min(z[i-l],r-i+1);
            }
            while(z[i] + i < n && s.substring(z[i], z[i]+1).equals(s.substring(i+z[i],i+z[i]+1)))
            {
                z[i]++;
            }
            if(z[i]+i-1 >r)
            {
                l=i;
               r=z[i]+i-1;
            }
        }
    }

    public static void main(String[] args) {
        String s= "aaabaab";
        int[] z = new int[s.length()];
        calculateZ(z, s);
        System.out.println("Z values "+ Arrays.toString(z));
    }
    
}