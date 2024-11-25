public class PalindromeNumberWithInARange {
    public static void main(String[] args) 
    {
        int st = 1,end = 150;
        range(st, end);
    }

    static void range(int st, int end)
    {
        if(st>end) return;
        if(isPalindrome(st, st, 0))
            System.out.println(st);
        
        range(st+1, end);
    }

    static boolean isPalindrome(int n, int m, int rev)
    {
        if(n==0) return rev == m;

        rev = (rev * 10) + n%10;
        return isPalindrome(n/10, m, rev);
    }
}
