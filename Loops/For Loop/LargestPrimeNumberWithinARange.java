import java.util.Scanner;

public class LargestPrimeNumberWithinARange {
    public static void main(String[] args) {
        System.out.print("Enter Your Range :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = 0;


        System.out.println("Prime Numbers are :- ");
        if(n<2)
        {
            largest = n;
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                boolean check = true;
                for(int j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        check = false;
                        break;
                    }
                }
                if(check)
                {
                    largest = i;
                    System.out.println(i);
                }
            }
        }
        System.out.println("Largest Prime Number is :- " + largest);
    }
}
