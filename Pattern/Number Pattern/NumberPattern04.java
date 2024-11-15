// Number Pattern = 4

//          1
//         121
//        12321
//       1234321
//      123454321


public class NumberPattern04 {
    public static void main(String[] args) {
		int n = 5;
		int sp = n-1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			for(int j=i-1;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
