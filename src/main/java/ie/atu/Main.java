package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer Part1 = new Customer("Paul","Kinvarra","3333","3333f",true);
        System.out.println(Part1.toString());

        Customer Part2 = new Customer();
        Part2.setName("Paul");
        Part2.setAddress("Kinvarra");
        Part2.setPhone("3333");
        Part2.setCustomerNumber("3333f");
        Part2.setMailingList(true);
        System.out.println(Part2.toString());
    }
}