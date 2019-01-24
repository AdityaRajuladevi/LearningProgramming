/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    private static boolean isPalindrome(int x)
    {
        if(x<0)
        return false;
        int n=x;
        int revNumber=0;
        while(n!=0)
        {
            revNumber = revNumber*10 + n%10;
            n=n/10;
        }
        return revNumber==x?true:false;
    }
}