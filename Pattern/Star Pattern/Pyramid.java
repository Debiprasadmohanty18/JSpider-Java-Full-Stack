public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        int sp = n-1;

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=sp;j++)System.out.print(" ");
            for(int j=1;j<=i;j++)System.out.print("*");
            for(int j=i-1;j>0;j--)System.out.print("*");
            System.out.println();
        }
    }
}
