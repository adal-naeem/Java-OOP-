/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

/**
 *
 * @author Adil Naeem
 */
import java.util.Scanner;
public class Calculator1 {
public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       System.out.println("Enter First Number");
       double num1= scanner.nextDouble();//--------------------------------------------------------
       System.out.println("Enter second number");
       double num2=scanner.nextDouble();
      System.out.println("Enter your choice:");
      System.out.println("1.Add(+)");
      System.out.println("2.Subtract(-)");
       int choice= scanner.next().charAt(0);//----------------------------------------------------
       double Result;
       switch(choice){
           case '+' : {
               Result= num1 + num2;
               System.out.println("Addition:" + Result);
        }
           case '-' : {
               Result= num1 - num2;
               System.out.println("Subtraction:" + Result);
        }
           default : System.out.println("Invalid choice.");  
       }
    }
}
