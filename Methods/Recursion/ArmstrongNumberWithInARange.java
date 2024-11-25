public class ArmstrongNumberWithInARange {
    public static void main(String[] args) {
        
        int st = 1;
        int end = 2000;
        range(st, end);
    }

    static void range(int st, int end)
    {
        if(st > end) return;

        int c = countDigit(st, 0);

        if(isArmstrong(st,st,c,0))
            System.out.println(st);
        
        range(st+1, end);

    }

    static boolean isArmstrong(int n, int m,int c, int sum)
    {
        if(n==0) return sum == m;
        sum += (int) Math.pow(n%10, c);

        return isArmstrong(n/10, m, c, sum);
    }

    static int countDigit(int n,int c)
    {
        if(n==0)
            return c;
        
        return (c+1) + countDigit(n/10, c);
    }
}
