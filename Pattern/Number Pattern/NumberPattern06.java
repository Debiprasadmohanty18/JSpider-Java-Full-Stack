// Not Fixed Yet

public class NumberPattern06 {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                int k = i*n;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(k-- +"\t");
                }
            }
            else
            {
                int k = (i*n)-(n-1);
                for(int j=1;j<=i;j++)
                {
                    System.out.print(k++ +"\t");
                }
            }
            System.out.println();
            
        }
    }
}
