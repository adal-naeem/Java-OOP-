/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

/**
 *
 * @author Adil Naeem
 */
public class Useofinterface {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        SmartDevice thermostat = new SmartThermostat();
        SmartDevice coffeeMachine = new SmartCoffeeMachine();
        // Turn on all devices
        light.turnOn();
        thermostat.turnOn();
        coffeeMachine.turnOn();
        System.out.println("-----");
        // Turn off all devices
        light.turnOff();
        thermostat.turnOff();
        coffeeMachine.turnOff();
    }
    }

