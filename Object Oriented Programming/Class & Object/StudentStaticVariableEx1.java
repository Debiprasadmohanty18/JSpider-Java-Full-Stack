public class StudentStaticVariableEx1 {

    String name;
    int age;

    static String institute;

    public static void main(String[] args) {
        StudentStaticVariableEx1 ob1 = new StudentStaticVariableEx1();
        ob1.name = "Anil Mohanty"; // Anil Mohanty
        ob1.age = 24; // 24
        ob1.institute = "Naresh IT"; // JSpider

        StudentStaticVariableEx1 ob2 = new StudentStaticVariableEx1();
        ob1.name = "Debiprasad Mohanty"; // Debiprasad Mohanty
        ob1.age = 22; // 22
        ob1.institute = "JSpider"; // JSpider

        System.out.println("Name :- "+ ob1.name + ", Age :- " + ob1.age + ", Institute Name :- " + ob1.institute);
        System.out.println("===========================================================");
        System.out.println("Name :- "+ ob2.name + ", Age :- " + ob2.age + ", Institute Name :- " + ob2.institute);
    }
}
