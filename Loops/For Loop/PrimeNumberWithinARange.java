import java.util.Scanner;

public class PrimeNumberWithinARange {
    public static void main(String[] args) {
        System.out.println("Enter first and last Range :- ");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int l = sc.nextInt();

        for(int i=f;i<=l;i++)
        {
            if(i<2)
                continue;
            boolean check = true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j == 0)
                {
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.println(i);
        }

    }
}
