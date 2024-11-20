import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        
        System.out.print("Enter Number of Lines :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0)n+=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==(n/2)+1 || j==1 || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
