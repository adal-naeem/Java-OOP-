import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class GUI2 {
    public static void main(String[] args) {


        JFrame Frame = new JFrame("Hello World");
        Frame.setSize(400,400);
        
        
        
        
        
        
        JTextField Field = new JTextField();
        Field.setBounds(10, 0, 370, 50);
        Frame.add(Field);
        
        
        
        
        
        
        
        
        JButton Button1 = new JButton("A");
        Button1.setBounds(20,80,100,100);
        Frame.add(Button1);
        
        
        
        
        
        
         Button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    Field.setText("A");
            }
        });    
         
         
         
         
          Frame.setLayout(null);
        Frame.setVisible(true);
    }
}