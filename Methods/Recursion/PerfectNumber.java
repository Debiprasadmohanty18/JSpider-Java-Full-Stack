
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n/2;
        System.out.println(isPerfect(n, i, 0));
    }

    public static boolean isPerfect(int n,int i,int sum)
    {
        if(i==0)
            return sum == n;
        if(n%i==0)
            sum+=i;
        return isPerfect(n,i-1,sum);
    }
}
