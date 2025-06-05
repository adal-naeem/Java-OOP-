/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

/**
 *
 * @author Adil Naeem
 */
public class Functionoverriding {//child parentclass ky function mn change krta hs
    public static void main(String[] args) {
        msgsender m1=new msgsender();
        emailsender m2=new emailsender();   
        m1.sendmsg();
        m2.sendmsg();
    }
}
