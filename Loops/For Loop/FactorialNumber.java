
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number To get Factorial :- ");
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int n = sc.nextInt();

        if(n==0)
        {
            System.out.println(n+"! = "+fact);
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                fact = fact * i;
            }
            System.out.println(n+"! = "+fact);
        }
    }
}
