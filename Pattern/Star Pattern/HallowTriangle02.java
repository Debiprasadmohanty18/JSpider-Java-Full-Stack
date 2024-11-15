// Hallow Triangle = 2 

//   * * * * * * * * 
//     *           * 
//       *         * 
//         *       * 
//           *     * 
//             *   * 
//               * * 
//                 * 

public class HallowTriangle02 {
    public static void main(String[] args) {
        int n = 8;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==n || i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
