public class NarrowingEx2 {
    public static void main(String[] args) {
        System.out.println(m1());
        System.out.println(m2());
    }

    static int m1()
    {
        // return 10; // CTS 10
        // return 9.5; // CTE
        return (int)9.5; // CTS 9
    }

    static double m2()
    {
        return 10.; //  CTS 10.0
    }
}
