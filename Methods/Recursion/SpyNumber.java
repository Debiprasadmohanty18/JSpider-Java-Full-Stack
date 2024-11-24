public class SpyNumber {
    public static void main(String[] args) {
        int n = 1124;
        int sum = 0;
        int prod = 1;
        System.out.println(isSpy(n, sum, prod));
    }

    static boolean isSpy(int n, int sum, int prod)
    {
        if(n==0) return sum == prod;

        sum+=n%10;
        prod*=n%10;

        return isSpy(n/10, sum, prod);
    }
}
