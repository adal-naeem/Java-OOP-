/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

/**
 *
 * @author Adil Naeem
 */
public class Car {
   String brand = "Toyota";
    String model = "Prado";
    int year = 2024;
    void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayCar();
    }
}
