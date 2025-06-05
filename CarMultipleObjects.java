/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

/**
 *
 * @author Adil Naeem
 */
public class CarMultipleObjects {
    String brand;
    String model;
    int year;
    CarMultipleObjects(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
    void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
    public static void main(String[] args) {
        CarMultipleObjects car1 = new CarMultipleObjects("Honda", "Civic", 2023);
        CarMultipleObjects car2 = new CarMultipleObjects("Mercedes-Benz", "S-Class", 2024); 
        CarMultipleObjects car3 = new CarMultipleObjects("Toyota", "Prado", 2024);
        car1.displayCar();
        car2.displayCar();
        car3.displayCar();
    }
}

