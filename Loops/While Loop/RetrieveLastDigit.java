

public class RetrieveLastDigit {
    public static void main(String[] args) {
        int n = 23486;
        int rem = 0;
        while(n!=0)
        {
            rem = n%10;
            n = n/10;
            System.out.println(rem);
        }
    }
}
