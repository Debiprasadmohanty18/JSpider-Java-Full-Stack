public class NarrowingEx3 {
    public static void main(String[] args) {
        int a = 130;
        byte b = (byte) a; // -126
        System.out.println(a + " " + b);

        int c = 50;
        double d = (double) c; // 50.0 
        System.out.println(c + " " + d);
    }
}
