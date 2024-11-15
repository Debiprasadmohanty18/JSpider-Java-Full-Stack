// Character Pattern - 2

//     A 
//     B C 
//     D E F 
//     G H I J 
//     K L M N O 

public class CharacterPattern02 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=1;i<=5;i++)
        {                           
            for(int j=i;j>0;j--)
            {
                System.out.print(ch+" ");
                ch = (char)(ch+1);
            }
            System.out.println();
        }
    }
}
