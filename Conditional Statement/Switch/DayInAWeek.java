import java.util.Scanner;

public class DayInAWeek {
    public static void main(String[] args) {
        
        System.out.println("Enter a Number to Know The Day :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        switch(n)
        {
            case 1 -> System.out.println("Sun Day");
            case 2 -> System.out.println("Mon Day");
            case 3 -> System.out.println("Tues Day");
            case 4 -> System.out.println("Wednes Day");
            case 5 -> System.out.println("Thurs Day");
            case 6 -> System.out.println("Fri Day");
            case 7 -> System.out.println("Satur Day");
            default -> {
                System.out.println("Invalid Input");
                System.out.println("Your Input not in Range");
            }
        }


    }
}
