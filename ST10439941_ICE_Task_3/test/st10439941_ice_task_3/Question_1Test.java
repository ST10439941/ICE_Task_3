/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10439941_ice_task_3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shane
 */
public class Question_1Test {
    
    public Question_1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
      
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Question_1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
       // String[] args = null;
       // Question_1.main(args);
        
    }

    /**
     * Test of isValid method, of class Question_1.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        // test case 1
        String input = "{}{(}";
        boolean expResult = false;
        boolean result = Question_1.isValid(input);
        assertEquals(expResult, result);
        
        // test case 2
        input = "";
        expResult = false;
        result = Question_1.isValid(input);
        assertEquals(expResult, result);
        
        // test case 3
        input = "{[}]";
        expResult = false;
        result = Question_1.isValid(input);
        assertEquals(expResult, result);
        
        // test case 4
        input = "()";
        expResult = false;
        result = Question_1.isValid(input);
        assertEquals(expResult, result);
        
        // test case 5
        input = "({[]})";
        expResult = false;
        result = Question_1.isValid(input);
        assertEquals(expResult, result);
        
    }
    
}
