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

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner marksInput = new Scanner(System.in);
        System.out.println("Enter your Marks:");
        int grd = marksInput.nextInt();

        switch(grd) {
            case 85:
                System.out.println("Marks = 85 => Grade: A+");
                break;

            case 80:
                System.out.println("Marks = 80 => Grade: A");
                break;

            case 70:
                System.out.println("Marks = 70 => Grade: B");
                break;

            default:
                System.out.println("Invalid or other marks entered");
        }
    }
}