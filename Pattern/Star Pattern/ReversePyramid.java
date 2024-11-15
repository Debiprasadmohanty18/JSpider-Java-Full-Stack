public class ReversePyramid {
    public static void main(String[] args) {
        int n = 7;
        int sp = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j>sp;j--)
            {
                System.out.print(" ");
            }

            for(int j=n-i;j>0;j--)
            {
                System.out.print("*");
            }

            for(int j=n-(i+1);j>0;j--)
            {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
