public class PrimeNumber {
    public static void main(String[] args) {

        int n = 7;
        int i = n/2;
        System.out.println(isPrime(n, i));
    }

    static boolean isPrime(int n, int i)
    {
        if(n <= 1) return false;
        if(i==1) return true;
        if(n%i==0) return false;
        
        return isPrime(n, i-1);
    }
}
