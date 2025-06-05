/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

/**
 *
 * @author Adil Naeem
 */
public interface SmartDevice {
    void turnOn();
    void turnOff();
}
// Light class implementing SmartDevice
class SmartLight implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Light is now ON. ");
    }
    @Override
    public void turnOff() {
        System.out.println("Smart Light is now OFF.");
    }
}
// Thermostat class implementing SmartDevice
class SmartThermostat implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Thermostat is now active. ");
    }
    @Override
    public void turnOff() {
        System.out.println("Thermostat is turned off.");
    }
}
// CoffeeMachine class implementing SmartDevice
class SmartCoffeeMachine implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Coffee machine is brewing coffee ");
    }
    @Override
    public void turnOff() {
        System.out.println("Coffee machine is shutting down.");
    }
}

