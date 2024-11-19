
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            sum += (int)Math.pow(rem, 2);
            n/=10; 
            if(n==0 && sum>9)
            {
                n = sum;
                sum = 0;
            }
        }
        return sum==1;
    }
}
