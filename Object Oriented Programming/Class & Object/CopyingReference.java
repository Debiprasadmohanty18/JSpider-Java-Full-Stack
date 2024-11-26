public class CopyingReference {
    int num;

    public static void main(String[] args) {
        CopyingReference c1 = new CopyingReference();
        c1.num = 10;
        System.out.println(c1.num); // 10

        CopyingReference c2 = c1;

        c2.num = 20;
        System.out.println(c2.num); //20  |===
                                  //      |   | ---> Now both c2 and c1 refer to same Heap Address.
        System.out.println(c1.num); //20  |===
    }
}
