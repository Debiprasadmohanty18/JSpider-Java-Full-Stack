public class NarrowingEx1 {
    public static void main(String[] args) {
        double a = 10.7;
        int c = (int) a;
        System.out.println(a + " " + c);

        int k = 35;
        char ch = (char) k;
        System.out.println(k + " " + ch);

        float b = 7.8f;
        long x = (long) b;
        System.out.println(b + " " + x);
    }
}
