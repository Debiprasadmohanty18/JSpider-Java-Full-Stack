import java.util.Scanner;

public class AlternatePrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter Your Start and End Range :- ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        range(start, end);
    }

    static void range(int start, int end)
    {
        int count = 0;
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                count++;
                if(count%2==0)
                    System.out.print(i+ " ");
            }
        }
    }

    static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
