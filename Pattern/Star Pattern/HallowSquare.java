// Hallow Square

//   X X X X X X X X 
//   X             X 
//   X             X 
//   X             X 
//   X             X 
//   X             X 
//   X             X 
//   X X X X X X X X 

public class HallowSquare {
    public static void main(String[] args) {
        
        int n = 8;

        // for(int i=1;i<=n;i++)
        // {
        //     System.out.print("X");
        // }
        // System.out.println();
        // for(int i=1;i<=n-2;i++)
        // {
        //     for(int j=1;j<=n;j++)
        //     {
        //         if(j == 1 || j == n)
        //             System.out.print("X");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++)
        // {
        //     System.out.print("X");
        // }

        // System.out.println();


// 2nd Approach

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j == 1 || j == n)
                    System.out.print("X ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
