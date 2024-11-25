public class PrimeNumberWithInARange {
    public static void main(String[] args) {
        int st=1,end = 20;
        range(st, end);
    }

    static void range(int st, int end)
    {
        if(st > end) return;
        if(isPrime(st,st/2))
            System.out.println(st);
        
        range(st+1, end);
    }

    static boolean isPrime(int n, int m)
    {
        if(n<=1) return false;
        if(m==1) return true;
        if(n%m==0) return false;

        return isPrime(n, m-1);
    }
}
