/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

/**
 *
 * @author Adil Naeem
 */
public class msgsender {
    void sendmsg()
    {
        System.out.println("sending a general msg");
    }
    }
    class emailsender extends msgsender
    {
        @Override
        void sendmsg()
        {
             System.out.println("sending a email msg");
        }
    }
