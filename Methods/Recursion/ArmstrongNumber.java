import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number :- ");
        int n = new Scanner(System.in).nextInt();
        int m = n;
        int sum = 0;
        int count = 0;
        System.out.println(isArmstrong(n, m, sum, count));
    }

    static boolean isArmstrong(int n, int m, int sum,int count)
    {
        if(n==m) 
            count = countDigit(m, count);
        if(n==0) return m==sum;
        sum += (int) Math.pow(n%10, count);

        return isArmstrong(n/10,m,sum,count);
    }

    static int countDigit(int m, int count)
    {
        if(m==0) return count;
        int rem = m%10;
        count++;
        return countDigit(m/10, count);
    }
}
