
package com.mycompany.circlecalculator;

public class CircleCalculatorTest {
  public static void main(String[] args){
       CircleCalculator calc = new CircleCalculator();

        double expected = Math.PI * 2 * 2;
        double actual = calc.calculateArea(2);
        
        if (Math.abs(expected - actual) < 0.0001) {
            System.out.println("Test 1 Passed (Correct Calculation)");
        } else {
            System.out.println("Test 1 Failed (Correct Calculation)");
        }
        double wrongExpected = 13.0; 
        if (Math.abs(wrongExpected - actual) < 0.0001) {
            System.out.println("Test 2 Passed (Incorrect Expected)");
        } else {
            System.out.println("Test 2 Failed (Incorrect Expected)");
        }
    }
  }

