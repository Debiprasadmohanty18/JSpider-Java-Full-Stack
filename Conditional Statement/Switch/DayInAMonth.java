import java.util.Scanner;

class DayInAMonth {
    public static void main(String[] args) {
        System.out.println("Enter Month And Year :- ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        switch(month)
        {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 Days");
            case 4, 6, 9, 11 -> System.out.println("30 Days");
            case 2 -> { 
                if((year%400 == 0) || (year%4 == 0 && year%100 != 0))
                    System.out.println("29 Days");
                else
                    System.out.println("28 Days");
            }
            default -> System.out.println("Invalid input!");

        }
    }
}