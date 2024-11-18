import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isEven(n));
    }

    static boolean isEven(int n)
    {
        return n%2==0;
    }
}
