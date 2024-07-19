package labEx1.lab1Test.src.test.java.org.example;

import labEx1.lab1Test.src.main.java.org.example.Addition;

import org.junit.After;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AddMethodsTest {
    private static Addition addition;
    private int add1;
    private int add2;
    private double add3;
    private String add4;
    @BeforeAll
    static void setUpBeforeAll(){
        addition = new Addition();
        System.out.println("Before All");
    }
    @BeforeEach
    void setUp(){
//        addition = new Addition();
        add1 = addition.add(10, 10);
        add2 = addition.add(10,10,10);
        add3 = addition.add(10.10,10.10);
        add4 = addition.add("Hello",20);
        System.out.println("Before Each");
    }

    @Test
    public void addTestIntInt(){
        assertEquals(20, add1);
    }
    @Test
    public void addTestIntIntInt(){
        assertEquals(30, add2);
    }
    @Test
    public void addTestDoubleDouble(){
        assertEquals(20.20, add3);
    }
    @Test
    public void addTestStringInt(){
        assertEquals("Hello 20",add4);
    }

    @AfterEach
    void messageAfterEach(){
        System.out.println("After Each");
    }
    @AfterAll
    static void messageAfterAll(){
        System.out.println("After All");
    }
}














//The lifecycle annotations in JUnit provide a structured way to set up and tear down the environment required for tests.
// They help manage resources, ensure consistent test conditions, and provide clear points for setup and cleanup actions.

