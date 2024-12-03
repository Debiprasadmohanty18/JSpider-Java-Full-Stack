import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :- ");
        String name = sc.next();

        Random randNum = new Random();
        int num = randNum.nextInt(11);
        // int num = (int)(Math.random()*10) + 1;
        // System.out.println(num);
        int score = 0;

        for(int i=3;i>=1;i--)
        {
            System.out.println("Enter Your Number :- ");
            int n = sc.nextInt();

            if(num == n)
            {
                System.out.println("Your Answer is Correct");
                score++;
                if(i != 1)
                {
                    num = randNum.nextInt(11); 
                    // num = (int)(Math.random()*10) + 1;   
                    // System.out.println(num);
                }           
            }
            else
            {
                System.out.println("Your Guess is Wrong.");
                System.out.println("You are having "+ (i - 1) + " chances left.");
            }
        }

        System.out.println(name + ", Your Score is " + score + " out of 3");

    }
}