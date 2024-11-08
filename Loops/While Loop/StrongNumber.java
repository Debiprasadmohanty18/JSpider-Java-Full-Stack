import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number to Check :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;

        while(n!=0)
        {
            int fact = 1;
            int rem = n%10;

            while(rem>0)
            {
                fact *= rem;
                rem--;
            }

            sum +=fact;
            n=n/10;
        }

        if(m == sum)
            System.out.println(m+ " is a Strong Number.");
        else
            System.out.println(m+ " is not a Strong Number.");
    }
}
