public class Employee {

    private int ID;
    private static int counter;

    public Employee(String firstName, String lastName, int age, double salary){
    counter = counter + 1;
    ID = counter;
    System.out.println(ID + "Detta är ID");
    System.out.println(counter + "Detta är counter");
    }

    public int getUniqueID() {
        return ID;
    }

}
