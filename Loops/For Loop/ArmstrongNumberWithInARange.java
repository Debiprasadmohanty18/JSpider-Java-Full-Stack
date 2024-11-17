import java.util.Scanner;

public class ArmstrongNumberWithInARange {
    public static void main(String[] args) {
        System.out.print("Enter Your start Range & end Range :- ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        for(int i=s;i<=e;i++)
        {
            int count = 0;
            int j = i;
            int sum = 0;
            while(i!=0)
            {
                int ren = i%10;
                count++;
                i/=10;
            }
            i=j;

            while(i>0)
            {
                int rem = i%10;
                sum = sum + (int) Math.pow(rem,count);
                i/=10;
            }
            i=j;
            if(sum == j)
                System.out.print(j+ " ");
        }
    }
}
