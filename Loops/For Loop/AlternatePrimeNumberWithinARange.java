import java.util.Scanner;

public class AlternatePrimeNumberWithinARange {
    public static void main(String[] args) {
        System.out.print("Enter your Range :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if(n<2)
            System.out.println(n);
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

                    if(count%2==0)
                    {
                        System.out.println(i);
                    }
                    count++;
                }
            }
        }
    }
}
