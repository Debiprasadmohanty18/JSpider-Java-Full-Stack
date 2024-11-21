public class WideningEx2 {
    public static void main(String[] args) {
        m1(10.5); // 10.5
        m1(7.5f); // 7.5
        m1(5); // 5.0
        m1(10+4); // 14.0
        System.out.println(m2()); // 7.5
    }

    static void m1(double d)
    {
        System.out.println("m1(double d) Executed"+ d);
    }

    static double  m2()
    {
        System.out.println("m2() Executed");
        // return 'A';  // 65.0
        // return 10;  // 10.0
        return 7.5f;   // 7.5
    }

}
