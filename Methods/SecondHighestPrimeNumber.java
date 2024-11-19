import java.util.Scanner;

public class SecondHighestPrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter Your Start and End Range :- ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        range(start, end);
    }

    static void range(int start, int end)
    {
        int largeNum = -1;
        int secondLargeNum = -1;
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                secondLargeNum = largeNum;
                largeNum = i;
            }
        }
        System.out.println("Largest Prime Number is :- "+largeNum);
        System.out.println("Second Largest Prime Number is :- "+secondLargeNum);
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
