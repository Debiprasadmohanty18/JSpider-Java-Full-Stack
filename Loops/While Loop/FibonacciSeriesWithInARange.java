import java.util.Scanner;

public class FibonacciSeriesWithInARange {
    public static void main(String[] args) {
        System.out.print("Enter your Range :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b = 1,sum = 0;

        // for ( ; a <= n; )
        while(a<=n) 
        {
            System.out.print(a+" ");
           sum = a+b; 
           a = b;
           b = sum;
        }

    }
}
