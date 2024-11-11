import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        covertWithoutMathFunction();
        System.out.print("Enter Binary Number to Convert To Decimal :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int power = 0;

        while(n>0)
        {
            int rem = n%10;
            sum += rem * (int) Math.pow(2, power++);
            n /= 10;
        }
        System.out.println("Decimal Number of Above Binary No. is :- "+sum);
    }

    static void covertWithoutMathFunction()
    {
        System.out.print("Enter Binary Number to Convert To Decimal :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(n>0)
        {
            int rem =  n%10;
            sum += rem * i;
            n /= 10;
            i *= 2;
        }
        System.out.println("Decimal Number of Above Binary No. is :- "+sum);
    }
}
