import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class testEmployee {

    Employee testObject;

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

            testObject = new Employee("Marcus", "Davidsson", 33, 10.000);
        }
}

// testObjekt = new Person("Marcus", "Davidsson", 32, true);
