/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adil Naeem
 */
class A {
    void showA(){
        
        System.out.println("A");
    }
}
 class B extends A{
    void showB(){
        System.out.println("B");
    }
}
class C extends B{
    void showC(){
        System.out.println("C");
    }
     public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
        
        B obj1= new B();
        obj1.showA();
        obj1.showB();
        //obj.showC();
        
        A obj2 = new A();
        obj2.showA();
        //obj1.showB();
        //obj.showC();
       
    }
}
