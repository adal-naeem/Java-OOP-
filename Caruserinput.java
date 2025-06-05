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
public class Caruserinput {
    String brand;
    String model;
    int year;
    void getCarDetails() {
        Scanner car = new Scanner(System.in);
        System.out.print("Enter Car Brand: ");
        brand = car.nextLine();
        System.out.print("Enter Car Model: ");
        model = car.nextLine();
        System.out.print("Enter Car Year: ");
        year = car.nextInt();
    }
    void displayCar() {
        System.out.println("\nCar Details:");
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
    public static void main(String[] args) {
        Caruserinput myCar = new Caruserinput();
        myCar.getCarDetails();
        myCar.displayCar();
    }
}

