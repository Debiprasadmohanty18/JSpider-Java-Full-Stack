
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return n * fact(n-1);
    }
}
