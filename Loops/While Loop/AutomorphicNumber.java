import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number to Check :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int square = n*n;
        boolean b = true;

        while(n!=0)
        {
            int rem = n%10;

            int sqrem = square%10;

            if(rem != sqrem)
                b = false;
            
            n = n/10;
            square = square/10;
        }

        if(b)
            System.out.println(m+ " is an Automorphic Number.");
        else
            System.out.println(m+ " is not an Automorphic Number.");
    }
}
