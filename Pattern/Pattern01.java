

public class Pattern01 {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i=1;i<=n;i++)
        {
            System.out.print("X");
        }
        System.out.println();
        for(int i=1;i<=n-2;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j == 1 || j == n)
                    System.out.print("X");
                else
                    System.out.println(" ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            System.out.print("X");
        }
    }
}
