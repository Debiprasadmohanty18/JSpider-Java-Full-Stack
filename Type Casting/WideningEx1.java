public class WideningEx1 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;
        System.out.println(a + " " + b); // 10 10

        char ch = 'A';
        int v = ch;
        System.out.println(ch + " " + v); // A 65

        int z = 'D';
        System.out.println(z); // 68

        int k = 10;
        double g = k;
        System.out.println(k+" "+g); // 10 10.0
    }
}
