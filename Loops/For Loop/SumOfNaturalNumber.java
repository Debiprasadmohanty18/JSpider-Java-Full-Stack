import java.util.Scanner;

class SumOfNaturalNumber {
    public static void main(String[] args) {
        
        System.out.print("Enter a range :- ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        for(int i=1;i<=n;i++)
        {
            sum +=i;
        }
        System.out.println("Sum :- "+ sum);

    }
}