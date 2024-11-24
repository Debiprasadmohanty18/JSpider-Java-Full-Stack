public class Ex1 {
    public static void main(String[] args) {
        m1(1);
    }

    static void m1(int i)
    {
        if(i==4) return;

        System.out.print(i+" ");
        m1(i+1);
        System.out.print(i+ " ");
        m1(i+1);
        System.out.print(i+" ");
        m1(i+1);
    }
}
