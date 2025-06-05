/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adil Naeem
 */
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class GUI {
    public static void main(String[] args) {
        JFrame Frame = new JFrame("Hello");
        Frame.setSize(400,400);
        
        JTextField Field = new JTextField();
        Field.setBounds(10, 0, 370, 50);
        Frame.add(Field);
        JButton Button1 = new JButton("A");
        Button1.setBounds(20,80,100,100);
        Frame.add(Button1);
         JButton Button2 = new JButton("B");
        Button2.setBounds(200,80,100,100);
        Frame.add(Button2);
         JButton Button3 = new JButton("C");
        Button3.setBounds(20,200,100,100);
        Frame.add(Button3);
         JButton Button4 = new JButton("D");
        Button4.setBounds(200,200,100,100);
        Frame.add(Button4);
        
        Button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    Field.setText("A");
            }
        });
        Button2.addActionListener(new ActionListener (){
        @Override
        public void actionPerformed(ActionEvent e){
            Field.setText("B");
        }     
    });
         Button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    Field.setText("C");
            }
            });
             Button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    Field.setText("D");
            }
        });
        
        Frame.setLayout(null);
        Frame.setVisible(true); 
       
    }
}
/*
  field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("MOHSIN");
            }
        });

*/