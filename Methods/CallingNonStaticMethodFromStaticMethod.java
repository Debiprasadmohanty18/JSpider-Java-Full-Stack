public class CallingNonStaticMethodFromStaticMethod {
    public static void main(String[] args) 
    {
         System.out.println("Main started");
        m1();
        System.out.println("Main Ended");
    }

    static void m1()
    {
        CallingNonStaticMethodFromStaticMethod ob = new CallingNonStaticMethodFromStaticMethod();
        ob.m2(); 
        System.out.println("In static");
    }
    void m2()
    {
        System.out.println("Non-Static Method");
    }
}
