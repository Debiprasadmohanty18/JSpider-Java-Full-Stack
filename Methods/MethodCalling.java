public class MethodCalling {
    public static void main(String[] args) 
    {
        System.out.println("Main Started");
        MethodCalling.m1();
        MethodCalling ob = new MethodCalling();
        ob.m2();
        System.out.println("Main Ended");
    }

    public static void m1()
    {
        System.out.println("Static Method");
    }
    public void m2()
    {
        System.out.println("Non-Static Method");
    }
}
