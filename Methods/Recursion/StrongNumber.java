public class StrongNumber
{
    public static void main(String[] args) {
        int n = 141;
        System.out.println(isStrong(n, n, 0));
    }

    static boolean isStrong(int n,int m,int s)
    {
        if(n==0) return s==m;
        s = s+fact(n%10);
        return isStrong(n/10, m, s);       
    }

    static int fact(int n)
    {
        if(n==0) return 1;

        return n * fact(n-1);
    }
}