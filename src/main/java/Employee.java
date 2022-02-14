public class Employee {

    int ID;
    int IDCounter = 1001;

    public Employee(String firstName, String lastName, int age, double salary){
    ID = IDCounter;
    IDCounter++;
    }

    public int getUniqueID() {
        return ID;
    }

}
