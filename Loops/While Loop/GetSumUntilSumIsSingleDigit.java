

public class GetSumUntilSumIsSingleDigit {
    public static void main(String[] args) {
        int n =79345;
        int rem = 0;
        int sum = 0;

        while(n!=0)
        {
            rem  = n%10;
            sum = sum+rem;
            n=n/10;
            if(n==0 && sum>9)
            {
                 System.out.println(sum);
                n = sum;           
                sum = 0;
            }
        }
        System.out.println(sum);
        
    }
}
