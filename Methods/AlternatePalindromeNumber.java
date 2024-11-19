import java.util.Scanner;

public class AlternatePalindromeNumber {
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
            if(isPalindrome(i))
            {
                count++;
                if(count%2==0)
                    System.out.print(i+ " ");
            }
        }
    }

    static boolean isPalindrome(int n)
    {
        int m = n;
        int sum = 0;

        while(m!=0)
        {
            int rem = m%10;
            sum = (sum*10)+rem;
            m/=10;
        }
        
        return sum==n;
    }

}
