/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Adil Naeem
 */
//100 percent bcz method are simple and abstract as well
interface I1 {
        //public static final int a=10;// variables hamesha public static final hon
        public abstract void show(); // method dont have body (body waly method k lia lamby chochaly hn / method hamesha public abstract hon
}
interface I2{//multiple level inheretence k lia bnaya
    public abstract void display();
}
class test implements I1,I2{//implements keyword use hota h
   public void show(){//child class methods ka access modifier hamesha brabar ya equal ho in / public ho ya phir
        System.out.println("1");//body dena must h 
    }
   public void display(){
       System.out.println("2");
   }
    public static void main(String[] args) {
        //I1 obj = new I1(); interface ka object ni bn sakta
        test obj1 = new test();
        obj1.show();
        obj1.display();
    }
}

