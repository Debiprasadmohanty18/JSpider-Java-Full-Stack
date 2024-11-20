
public class MainMethodOverloading {

    public static void main() {
        System.out.println("Main Method With No Argument");
    }
    public static void main(double  i) {
        System.out.println("Main Method With one Argument");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        main();
        main(10);
        main(6,7);
    }

    public static void main(int i, int j) {
        System.out.println("Main Method With Two Argument");
    }


}
