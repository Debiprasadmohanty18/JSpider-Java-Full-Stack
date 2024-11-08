import java.util.Scanner;

class SpyNum {
    public static void main(String[] args) {
        System.out.print("Enter a Number to Check :- ");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        int prod = 1;

        while(n!=0)
        {
            int rem = n % 10;
            sum = sum+rem;
            prod = prod*rem;
            n=n/10;
        }

        if(prod == sum)
            System.out.println(m+ " is a Spy Number.");
        else
            System.out.println(m+" is not a Spy Number.");
    }
}