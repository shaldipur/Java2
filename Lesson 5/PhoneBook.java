/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 5
 *  Exercise 2
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class PhoneBook extends JFrame implements ActionListener{

    //JFrame setup and field initialization

    Font font = new Font("Arial", Font.BOLD, 16);

    JComboBox<String> name = new JComboBox<>();

    JLabel display = new JLabel();

    final int WIDTH = 275;

    final int HEIGHT = 225;


    public PhoneBook(){

        super("Display Phone Numbers");

        name.addItem("Bob");
        name.addItem("Sally");
        name.addItem("Mike");
        name.addItem("Alice");
        name.addItem("Tom");

        setSize(HEIGHT, WIDTH);

        setLayout(new FlowLayout());

        display.setFont(font);

        add(name);

        add(display);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        name.addActionListener(this);

    }

    //event handling action
    @Override
    public void actionPerformed(ActionEvent e){

        String number = "";

        Object personName = name.getSelectedItem();

        if(personName.toString().equals("Bob")){

            number = "222-2222";

            String message = "The number for " + personName.toString() + " is " + number + ".";

            display.setText(message);
        }

        if(personName.toString().equals("Sally")){

            number = "333-3333";

            String message = "The number for " + personName.toString() + " is " + number + ".";

            display.setText(message);
        }

        if(personName.toString().equals("Mike")){

            number = "444-4444";

            String message = "The number for " + personName.toString() + " is " + number + ".";

            display.setText(message);
        }

        if(personName.toString().equals("Alice")){

            number = "555-5555";

            String message = "The number for " + personName.toString() + " is " + number + ".";

            display.setText(message);
        }

        if(personName.toString().equals("Tom")){

            number = "666-6666";

            String message = "The number for " + personName.toString() + " is " + number + ".";

            display.setText(message);
        }



    }


}
