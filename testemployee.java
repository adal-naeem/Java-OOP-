/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;
public class testemployee {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Adil", 1, 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Aslam", 2, 20, 40);
        System.out.println("Full-time Employee Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Part-time Employee Salary: " + partTimeEmployee.calculateSalary());
    }
}

