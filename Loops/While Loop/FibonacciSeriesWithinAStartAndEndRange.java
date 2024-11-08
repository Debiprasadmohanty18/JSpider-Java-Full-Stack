import java.util.Scanner;

public class FibonacciSeriesWithinAStartAndEndRange {
    public static void main(String[] args) {
        System.out.print("Starting Range :- ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.print("Last Range :- ");
        int l = sc.nextInt();

        int a = 0 ,b = 1, sum = 0;

        while(a<=l)
        {
            if(a >= s && a <= l)
            {
                System.out.print(a + " ");
            }
            sum = a+b;
            a=b;
            b=sum;
        }
    }
}
