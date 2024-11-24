
import java.util.Scanner;

public class SumOfDigitTillSingleDigit {
    public static void main(String[] args) {
        System.out.print("Enter a Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    static int sum(int n)
    {
        if(n==0) return 0;
        int s = n%10 + sum(n/10);
        return s>9 ? sum(s) : s;
    }
}
