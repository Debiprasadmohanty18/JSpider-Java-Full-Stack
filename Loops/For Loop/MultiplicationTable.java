
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter A Number To Get Multiplication Table :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;

        for(int i=1;i<=10;i++)
        {
            mul = n*i;
            System.out.println(n +" X "+i+" = "+mul);
        }
    }
}
