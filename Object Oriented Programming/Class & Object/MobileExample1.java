public class MobileExample1 {

    String name;
    String colour;
    int price;

    public static void main(String[] args) {
        MobileExample1 m1 = new MobileExample1();
        m1.name = "Vivo";
        m1.colour = "Red";
        m1.price = 19999;
        MobileExample1 m2 = new MobileExample1();

        System.out.println("Name :- "+ m1.name + ", Colour :- "+ m1.colour + ", Price :- " + m1.price); // Name :- Vivo, Colour :- Red, Price :- 19999
        System.out.println("======================================================");
        System.out.println("Name :- "+ m2.name + ", Colour :- "+ m2.colour + ", Price :- " + m2.price); //Name :- null, Colour :- null, Price :- 0
    }
}
