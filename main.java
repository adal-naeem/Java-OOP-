/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;


public class Main {
    public static void main(String[] args) {
        
        Book book = new Book("Rich Dad Poor Dad ", "Ali", "111-1111111111");
        EBook eBook = new EBook("Clash of civilizations", "Ahmad", "222-2222222222", 2.5);

      
        System.out.println("Book Details:");
        book.displayInfo();

        System.out.println("\nEBook Details:");
        eBook.displayInfo();
    }
}

