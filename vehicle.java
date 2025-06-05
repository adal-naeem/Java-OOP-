/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adil Naeem
 */
//0 to 100 percent bcz method are simple and abstract as well
public abstract class vehicle {
    int no_of_tyres;
    abstract void start();// abstract method means without body
}
class scooter extends vehicle{
    void start(){
        System.out.println("start with kick");//abstract method dody dena is must
    }
}
class car extends vehicle{
    void start(){
        System.out.println("start with key");//abstract method dody dena is must
    }
    public static void main(String[] args) {
        scooter s = new scooter();
        s.start();
        car c = new car();
        c.start();
       // vehicle v = new vehicle(); abstract class cannot have object
    }

}