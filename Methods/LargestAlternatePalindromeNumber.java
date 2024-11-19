import java.util.Scanner;

public class LargestAlternatePalindromeNumber {
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
        int altCount = 0;
        for(int i=end;i>=start;i--)
        {
            if(isPalindrome(i))
            {
                count++;
                if(count%2==0)
                {
                    altCount++;
                    if(altCount==1)
                        System.out.println("First Largest Alternate Palindrome Number :- "+ i);
                    if(altCount==2)
                        System.out.println("Second Largest Alternate Palindrome Number :- "+ i);
                    if(altCount==3)
                        System.out.println("Third Largest Alternate Palindrome Number :- "+ i);
                }
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

