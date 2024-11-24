public class VarArgEx2 {
    public static void main(String[] args) {
        m1(10,20); // m1(int a, int b);
        System.out.println("======================");
        m1(10);
        System.out.println("======================");
        m1(60,80,90);
        System.out.println("======================");
        // m1(10,9.5,7.5); // CTE
    }

    public static void m1(int...a)
    {
        for(int i : a)
        {
            System.out.println("m1(int...a) Executed " + i);
        }
    }

    public static void m1(int a,int b)
    {
        System.out.println("m1(int a, int b) "+ a + " " + b);
    }

}
