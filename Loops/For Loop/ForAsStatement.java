

public class ForAsStatement {
    public static void main(String[] args) {

        int i=0;
        for(System.out.println("I'm  Initializer, I will Execute only Once."); i<3;System.out.println("I'm Increment Decrement Statement, I will Execute as many time the code will iterate"))
        {
            System.out.println("I'm Body, Execute until Condition False");
            i++;
        }

    }
}
