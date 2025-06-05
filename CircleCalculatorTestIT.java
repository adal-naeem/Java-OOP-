/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.circlecalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author arish
 */
public class CircleCalculatorTestIT {
    
    public CircleCalculatorTestIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of testCalculateArea_Correct method, of class CircleCalculatorTest.
     */
    @Test
    public void testTestCalculateArea_Correct() {
        System.out.println("testCalculateArea_Correct");
        CircleCalculatorTest instance = new CircleCalculatorTest();
        instance.testCalculateArea_Correct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testCalculateArea_Wrong method, of class CircleCalculatorTest.
     */
    @Test
    public void testTestCalculateArea_Wrong() {
        System.out.println("testCalculateArea_Wrong");
        CircleCalculatorTest instance = new CircleCalculatorTest();
        instance.testCalculateArea_Wrong();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
