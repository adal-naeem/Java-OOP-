import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {
    JTextField inputFeild ;
    float op1, op2;
    char operator;


    public Calculator(){
        JFrame frame = new JFrame("Calculator");
        //controls

        inputFeild = new JTextField();

        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton multiple = new JButton("X");

        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton divide = new JButton("/");

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton subtract = new JButton("-");

        JButton zero = new JButton("0");
        JButton point = new JButton(".");
        JButton equal = new JButton("=");
        JButton addition = new JButton("+");


        //location and dimension
        inputFeild.setBounds(10,20,235,40);

        seven.setBounds(10, 80, 50,50 );
        eight.setBounds(70, 80, 50,50);
        nine.setBounds(130, 80, 50,50);
        multiple.setBounds(190, 80, 50,50);

        four.setBounds(10, 140,50,50);
        five.setBounds(70, 140, 50,50);
        six.setBounds(130, 140, 50,50);
        divide.setBounds(190, 140, 50,50);

        one.setBounds(10, 200, 50,50);
        two.setBounds(70, 200, 50,50);
        three.setBounds(130, 200, 50,50);
        subtract.setBounds(190, 200, 50,50);

        zero.setBounds(10, 260,50,50);
        point.setBounds(70, 260, 50,50);
        equal.setBounds(130, 260, 50,50);
        addition.setBounds(190, 260,50,50);

        controlBinder(one);
        controlBinder(two);
        controlBinder(three);
        controlBinder(four);
        controlBinder(five);
        controlBinder(six);
        controlBinder(seven);
        controlBinder(eight);
        controlBinder(nine);
        controlBinder(zero);
        controlBinder(point);
        controlBinder(addition);
        controlBinder(subtract);
        controlBinder(multiple);
        controlBinder(divide);
        controlBinder(equal);

        //frame

        frame.add(inputFeild);

        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(multiple);

        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(divide);

        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(subtract);

        frame.add(zero);
        frame.add(point);
        frame.add(equal);
        frame.add(addition);

        frame.setSize(290,380);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void controlBinder(JButton myButton)
    {
        myButton.addActionListener(new ActionListener()
                                   {
                                       public void actionPerformed(ActionEvent e)
                                       {
                                           String s = e.getActionCommand();

                                           operations(s);
                                       }
                                   }
        );
    }

    public void operations(String s)
    {
        char text = s.charAt(0);
        if (text=='0' || text=='1' || text=='2' || text=='3' || text=='4' || text=='5' || text=='6' || text=='7' || text=='8' || text=='9' || text=='.'  )
        {
            inputFeild.setText(inputFeild.getText() + s);
        }
        else if (text=='+' || text=='-' || text=='*' || text=='/'  )
        {
            op1 = Float.parseFloat(inputFeild.getText());
            operator = text;
            inputFeild.setText("");
        }
        else {
            op2 = Float.parseFloat(inputFeild.getText());
            float answer=0;
            switch(operator)
            {
                case '+': answer = op1+ op2; break;
                case '-': answer = op1- op2; break;
                case '*': answer = op1 * op2; break;
                case '/': answer = op1/ op2; break;
                default:
                    inputFeild.setText("Yaahan masla ha" );
            }
            inputFeild.setText("" + answer);
        }
    }
}