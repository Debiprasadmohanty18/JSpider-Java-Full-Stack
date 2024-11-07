import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter A Number To Check Perfect or Not :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == n)
            System.out.println(n+" is a Perfect Number");
        else
            System.out.println(n+ " is not a Perfect Number");
    }
}
