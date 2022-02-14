import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class testEmployee {

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

            testObject1 = new Employee("Marcus", "Davidsson", 33, 10.000);
            testObject2 = new Employee("Jacob", "Nilsson", 23, 10.000);
            testObject3 = new Employee("Anki", "Phan", 24, 10.000);
        }


        @Test
        public void checkGetUniqueIDtest(){

            int expected = 1001;


            int actual = testObject1.getUniqueID();

            Assertions.assertEquals(expected, actual);

        }

        @ParameterizedTest
        @ValueSource (ints = {1001, 1002, 1003})


        public void checkGetUniqueID2test(){

            int expected1 = 1001;
            int expected2 = 1002;
            int expected3 = 1003;


            int actual1 = testObject1.getUniqueID();
            int actual2 = testObject2.getUniqueID();
            int actual3 = testObject3.getUniqueID();

            Assertions.assertEquals(expected1, actual1);
            Assertions.assertEquals(expected2, actual2);
            Assertions.assertEquals(expected3, actual3);

        }
}

// testObjekt = new Person("Marcus", "Davidsson", 32, true);
