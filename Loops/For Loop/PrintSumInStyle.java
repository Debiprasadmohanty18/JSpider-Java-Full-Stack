import java.util.Scanner;

public class PrintSumInStyle {
    public static void main(String[] args) {
        
        System.out.print("Enter a Range :- ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        int sum = 0;

        for(int i=1;i<=n;i++)
        {
            sum += i; 
            s=s+i; 
            if(i<n)
            {
                s =s+"+";
            }                    
        }
        System.out.println(s +" = "+sum);

    }
}
