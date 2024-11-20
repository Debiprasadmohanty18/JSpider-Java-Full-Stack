

public class MethodOverloadingFlow {
    public static void main(String[] args) {
        m1(10);
        m1();
        m1(10, 7);
        m1(12.34,18);
    }

    static void m1()
    {
        System.out.println("No Argument Method");
    }

    static int m1(int k)
    {
        System.out.println("Single Argument Method");
        return k;
    }

    static void m1(int i,int j)
    {
        System.out.println("Double Argument Method");
    }

    static void m1(double i,int j)
    {
        System.out.println("Double Argument Method but Different Datatype");
    }
}
