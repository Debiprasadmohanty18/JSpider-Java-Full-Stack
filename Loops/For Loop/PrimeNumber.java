import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to Check Prime or not :- ");

        int n = sc.nextInt();
        boolean b = true;

        if(n<2)
        {
            System.out.println(n+ " is a Special Number");
        }
        else
        {
            for(int i = 2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    b = false;
                    System.out.println(n+" is not a Prime Number");
                }
            }
            if(b)
            {
                System.out.println(n+" is a Prime Number");
            }
        }


        
    }
}
