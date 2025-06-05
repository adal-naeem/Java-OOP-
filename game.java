/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Adil Naeem
 */
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        player p = new player();
        player q = new player();
        
        p.setname("adil");
        q.setname("Asif");
        
        String p1 = p.getname();
        System.out.println("first person name "+ p1);
        String q1 =q.getname();
        System.out.println("Second person name "+ q1);
        
        p.displayname();
        q.displayname();
        
        /*Scanner kb = new Scanner(System.in);
        player p1=new player();
        player p2=new player();//instance of class
        
        p1.setName( "X man");
        p2.setName("spider man");
        
        String p=p1.getName();
        System.out.println("player one name is ="+p);
        
        String q=p2.getName();
        System.out.println("player one name is ="+q);//direct likh sakty hn ku k iski return type string hi h
        
        p1.displayName();
        p2.displayName();
        */
    }
}
