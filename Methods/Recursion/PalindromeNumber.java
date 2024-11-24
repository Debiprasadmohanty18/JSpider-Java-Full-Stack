public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12321;
        int rev = 0;
        System.out.println(isPalindrome(n, n, rev));
    }

    static boolean isPalindrome(int n, int m, int rev) 
    {
        if(n==0)
            return rev == m;
        
        rev = (rev*10) + n%10;

        return isPalindrome(n/10, m, rev);
    }
}
