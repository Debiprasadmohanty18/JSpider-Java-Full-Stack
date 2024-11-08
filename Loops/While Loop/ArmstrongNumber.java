import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number to Check :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int count = 0;
        int rem = 0,sum=0;

        while(n!=0)
        {
            rem = n%10;
            count++;
            n /=10;
        }
        n = m;
        while(n!=0)
        {
            rem = n%10;
            sum += (int) Math.pow(rem, count);
            n /= 10;
        }
        if(m == sum)
            System.out.println(m + " is an Armstrong Number.");
        else
            System.out.println(m + " is not an Armstrong Number.");
    }
}
