/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 5
 *  Exercise 1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Name extends JFrame implements ActionListener {

    //JFrame setup and field initialization

    JLabel instruction = new JLabel("Please click the button:");

    Font font = new Font("Arial", Font.BOLD, 16);

    JButton button = new JButton("Click here");

    JLabel display = new JLabel();

    final int WIDTH = 275;

    final int HEIGHT = 225;

    String name = "";

    ArrayList<String> names = new ArrayList<String>();

    //constructor

    public Name(){

        super("Display Names");

        names.add("Bob");
        names.add("Sally");
        names.add("Mike");
        names.add("Alice");
        names.add("Tom");

        setSize(HEIGHT, WIDTH);

        setLayout(new FlowLayout());

        instruction.setFont(font);

        display.setFont(font);

        add(instruction);

        add(button);

        add(display);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(this);

    }


    //event handling action
    @Override
    public void actionPerformed(ActionEvent e){

        String name = names.get(0);

        display.setText(name);

        names.remove(0);

    }





}
