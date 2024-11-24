public class VarArgEx1 {
    public static void main(String[] args) {
        m1(10,20);
        System.out.println("====================");
        m1(80);
        System.out.println("====================");
        m1("Virat");
        System.out.println("====================");
        m1("Virat","Rohit","Rahul");
        System.out.println("====================");
    }

    public static void m1(int...a)
    {
        for(int i : a)
        {
            System.out.println("m1(int...a) Executed " + i);
        }
    }

    public static void m1(String...s)
    {
        for(String i : s)
        {
            System.out.println("m1(String...s) Executed " + i);
        }
    }
}
