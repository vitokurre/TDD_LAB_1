import org.junit.jupiter.api.*;

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


        @Test
        public void checkGetUniqueIDtest(){

            int expected = 1001;

            int actual = testObject.getUniqueID();


        }
}

// testObjekt = new Person("Marcus", "Davidsson", 32, true);
