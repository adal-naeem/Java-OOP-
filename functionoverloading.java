/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

/**
 *
 * @author Adil Naeem
 */
public class functionoverloading {//A class has multiple methods with the same name but different parameters (number or type).
    int add(int a, int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    int add(int a, int b,int c)
    {
        return a+b+c;
    }
}

