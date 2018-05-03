/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 6
 *  Exercise 1
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLocation extends JFrame implements ActionListener{

    //buttons
    private JButton nb = new JButton("Top Region");
    private JButton sb = new JButton ("Bottom Region");
    private JButton eb = new JButton ("Right Region");
    private JButton wb = new JButton ("Left Region");

    private JLabel messageLabel = new JLabel("");



    private Container con = getContentPane();

    public BorderLocation(){

        //set layout
        con.setLayout(new BorderLayout());

        //add button to different container regions
        con.add(nb, BorderLayout.NORTH);
        con.add(sb, BorderLayout.SOUTH);
        con.add(eb, BorderLayout.EAST);
        con.add(wb, BorderLayout.WEST);

        //set label visibility
        messageLabel.setVisible(true);


        //add action listeners
        nb.addActionListener(this);
        sb.addActionListener(this);
        eb.addActionListener(this);
        wb.addActionListener(this);


        //add label to container
        con.add(messageLabel);



        //set container size
        setSize(400, 150);

    }

//
    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();

        if(source == nb){

            messageLabel.setText("North");

        }

        if(source == sb){
            messageLabel.setText("South");
        }

        if(source == eb){
            messageLabel.setText("East");
        }
        if(source == wb){
            messageLabel.setText("West");
        }
    }

    public static void main(String[] args){
        BorderLocation frame = new BorderLocation();
        frame.setVisible(true);
    }



}
