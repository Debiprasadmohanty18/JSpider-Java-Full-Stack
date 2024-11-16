
import java.util.Scanner;

public class AlternateArmstrongNumberWithInARange {
    public static void main(String[] args) {
        System.out.print("Enter Your Range :- ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        int countArmstrong = 0;
        for(int i=s;i<=e;i++)
        {
            int j = i;
            int count = 0;
            int sum = 0;
            while(i>0)
            {
                int rem = i%10;
                count++;
                i/=10;
            }
            i = j;
            while(i!=0)
            {
                int rem = i%10;
                sum = sum + (int) Math.pow(rem,count);
                i/=10;
            }
            i = j;

            if(j == sum)
            {
                countArmstrong++;
                if(countArmstrong % 2==1)
                    System.out.print(j + " ");
            }
        }
    }
}
