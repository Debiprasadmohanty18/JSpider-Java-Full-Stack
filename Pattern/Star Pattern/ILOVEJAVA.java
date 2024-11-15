public class ILOVEJAVA {
    public static void main(String[] args) {
        int n = 5;
        int v = 7;
        int h = 7;


        System.out.println();
        System.out.println();
        
        //I

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==3 || i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        //L

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1;j++)
            {
                if(i==5 || j==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //O

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i==1) || (j==1) || (i==n) || (j==n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        
        // V

        for(int i = 1;i<=(v/2)+1;i++)
        {
            for(int j =1;j<=v;j++) 
            {
                if((i==j)||(i+j==v+1))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //E

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==3 || i==n || j==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //J

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i==1) || (j==4 && i!=n) || (j<=3 && i==n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //A

        for(int i = 1;i<=(v/2)+1;i++)
        {
            for(int j=1;j<=v;j++) 
            {
                if((i+j==v-2)||(j-i==v-4) || (i==3 && (j>2 && j<6)))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //V

        for(int i = 1;i<=(v/2)+1;i++)
        {
            for(int j =1;j<=v;j++) 
            {
                if((i==j)||(i+j==v+1))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //A

        for(int i = 1;i<=(v/2)+1;i++)
        {
            for(int j=1;j<=v;j++) 
            {
                if((i+j==v-2)||(j-i==v-4) || (i==3 && (j>2 && j<6)))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //  * *   * *
        // *    *    *
        //  *       *
        //    *   *
        //      *

        for(int i=0;i<h-1;i++)
        {
            for(int j=0;j<h;j++) 
            {
                if((i==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2) || (i+j==8))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}
