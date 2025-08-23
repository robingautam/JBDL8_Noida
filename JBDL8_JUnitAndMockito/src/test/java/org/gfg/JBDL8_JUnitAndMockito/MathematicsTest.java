package org.gfg.JBDL8_JUnitAndMockito;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MathematicsTest {

    Mathematics mathematics;

    @BeforeEach
    public void beforeEach(){
         mathematics = new Mathematics();
        System.out.println("Before Each");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @Test
    @Order(2)
    @Disabled
    public void addTest(){
        int result = mathematics.add(2,3,1,5,6);
        Assertions.assertEquals(17,result);
    }

    @Test
    @Order(1)
    @DisplayName("Robin")
    public void evenNumberFilterTest(){
        Mathematics mathematics = new Mathematics();
        int actualResult[] = mathematics.evenNumberFilter(3,2,1,4,8,7,6,5,11,10);
        int expected[] = {2,4,8,6,10};
        Assertions.assertArrayEquals(expected,actualResult);

    }


   // @Test
    @ParameterizedTest
    @CsvSource({"2,3,5","3,4,7"})
    public void test(int num1, int num2, int expected){
      int actual = mathematics.add(num1,num2);
      Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/jbdl8_tests.csv",numLinesToSkip = 1)
    public void testCSV(int num1, int num2, int expected){
        int actual = mathematics.add(num1,num2);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3,9,7,11,13})
    public void isOdd(int num){
       boolean actual = mathematics.isOdd(num);
        Assertions.assertTrue(actual);
    }
}
