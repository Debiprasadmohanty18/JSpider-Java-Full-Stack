// Pattern = 2

//    1 
//    2 3 
//    4 5 6 
//    7 8 9 10 


public class NumberPattern02 {
    public static void main(String[] args) {
        
        int n = 1;

        for(int i=1;i<5;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }

    }
}
