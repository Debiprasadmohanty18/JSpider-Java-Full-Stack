public class MethodReturnType {
    public static void main(String[] args) {
        m1();  // Void return type
        m2();  // Integer return type
        m3();  // Float return type
        m4();  // Boolean return type
        m5();  // Double return type
        m6();  // Character return type
        m7();  // String return type
    }

    static void m1()
    {
        System.out.println("No Return Type --> void");
    }

    static int m2()
    {
        System.out.println("Integer Return Type --> int");
        return 10;
    }

    static float m3()
    {
        System.out.println("Float return Type --> float");
        return 10.76f;
    }

    static boolean m4()
    {
        System.out.println("Boolean Return Type --> boolean");
        return true;
    }

    static double m5()
    {
        System.out.println("Double Return Type --> double");
        return 5.678;
    }

    static char m6()
    {
        System.out.println("Character Return Type --> char");
        return 'A';
    }

    static String m7()
    {
        System.out.println("String Return Type --> String");
        return "Hello";
    }
}
