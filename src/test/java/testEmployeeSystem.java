import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class testEmployeeSystem {
    Employee testObject1;
    Employee testObject2;
    Employee testObject3;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Nu börjar testsviten för Labb 1 i TDD");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Nu avslutas testsviten");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Test slut");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("Test start");

        testObject1 = new Employee("Marcus", "Davidsson", 33, 30500.00);
        testObject2 = new Employee("Jacob", "Nilsson", 23, 30500.00);
        testObject3 = new Employee("Anki", "Phan", 24, 30500.00);
    }


}
