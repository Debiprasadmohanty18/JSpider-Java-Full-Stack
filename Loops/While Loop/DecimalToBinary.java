import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        convertUsingInteger();
        convertUsingString();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to Convert to Binary :- ");
        int n = sc.nextInt();

        while(n>0)
        {
            int bin = n%2;
            System.out.print(bin + " ");
            n/=2;
        }
    }

    static void convertUsingString()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to Convert to Binary :- ");
        int n = sc.nextInt();

        String bit = "";

        while(n>0)
        {
            int bin = n%2;
            bit = bin + bit;
            n/=2;
        }

        System.out.println(bit);

    }

    static void convertUsingInteger()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to Convert to Binary :- ");
        int n = sc.nextInt();

        int bit = 0;
        int i = 1;

        while(n>0)
        {
            int bin = n%2;
            bit = (bin * i) + bit;
            n/=2;
            i*=10;
        }

        System.out.println(bit);

    }

}
