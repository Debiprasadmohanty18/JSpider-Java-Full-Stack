import java.util.Scanner;

public class SquareOfANumber {
    public static void main(String[] args) {
        System.out.print("Enter A Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(square(n));
    }

    static int square(int n)
    {
        return n*n;
    }
}
