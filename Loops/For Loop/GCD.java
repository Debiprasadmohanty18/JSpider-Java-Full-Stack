import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        System.out.println("Enter two Number to get GCD :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 0;

        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i == 0 && b%i == 0)
                gcd = i;
        }
        System.out.println("GCD :- " + gcd);
    }
}