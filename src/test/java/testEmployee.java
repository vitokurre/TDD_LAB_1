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

            int expected = 1;


            int actual = testObject1.getUniqueID();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void checkGetUniqueID2test(){

            int expected1 = 1;
            int expected2 = 2;
            int expected3 = 3;


            int actual1 = testObject1.getUniqueID();
            int actual2 = testObject2.getUniqueID();
            int actual3 = testObject3.getUniqueID();

            Assertions.assertEquals(expected1, actual1);
            Assertions.assertEquals(expected2, actual2);
            Assertions.assertEquals(expected3, actual3);

        }
}

// @ParameterizedTest
//    @ValueSource (ints = {-3, 5, 6, 10})
//    public void checkNegativeValue(int intput){
//        testObjekt = new myClass();
//
//        int actual = testObjekt.negatvie(intput);
//
//        assertFalse(testObjekt.negatvie(intput)>0);
