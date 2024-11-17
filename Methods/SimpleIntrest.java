
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        simpleIntrest();
    }

    static void simpleIntrest()
    {
        System.out.println("Enter Percentage & Time & Rate of Intrest :- ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();

        int res = (p*t*r)/100;
        System.out.println("Simple Intrest :- "+ res);
    }

}
