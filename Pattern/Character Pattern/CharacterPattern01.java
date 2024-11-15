// Character Pattern = 1

//    A       B 
//      C   D   
//        E     
//      F   G   
//    H       I 

public class CharacterPattern01 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=1;i<=5;i++)
        {                           
            for(int j=1;j<=5;j++)
            {
                if(i==j || i+j==6)
                {
                    System.out.print(ch+ " ");
                    ch = (char) (ch+1);
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
