/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 5
 *  Exercise 3
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class BobBurger extends JFrame implements ActionListener {

    //JFrame setup and field initialization

    Font font = new Font("Arial", Font.BOLD, 16);

    JComboBox<String> drinkSize = new JComboBox<>();

    JCheckBox lettuce = new JCheckBox("Lettuce", false);

    JCheckBox cheese = new JCheckBox("Cheese", false);

    JCheckBox pickles = new JCheckBox("Pickles", false);

    JLabel displayCheckBoxOption = new JLabel();

    JLabel displayDropDownOption = new JLabel();

    final int WIDTH = 500;

    final int HEIGHT = 500;

    final int BURGER_PRICE = 5;

    final int DOUBLE_BURGER_PRICE = 7;

    final int LETTUCE_PRICE = 1;

    final int CHEESE_PRICE = 2;

    final int PICKLES_PRICE = 3;

    final int SMALL_DRINK_PRICE = 1;

    final int MEDIUM_DRINK_PRICE = 2;

    final int LARGE_DRINK_PRICE = 3;





    public BobBurger(){

        super("Display Customer Order");

        drinkSize.addItem("Small");
        drinkSize.addItem("Medium");
        drinkSize.addItem("Large");

        add(lettuce);
        add(cheese);
        add(pickles);


        setSize(HEIGHT, WIDTH);

        setLayout(new FlowLayout());

        displayCheckBoxOption.setFont(font);

        displayDropDownOption.setFont(font);


        add(drinkSize);

        add(displayCheckBoxOption);

        add(displayDropDownOption);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drinkSize.addActionListener(this);

        lettuce.addActionListener(this);

        cheese.addActionListener(this);

        pickles.addActionListener(this);

    }

    //event handling actions
    @Override
    public void actionPerformed(ActionEvent e){

        String lettuceMessage = "";
        String cheeseMessage = "";
        String pickleMessage = "";
        String drinkMessage = "";

        //handle the checkbox options
        Object lettuceSelected = lettuce.isSelected();

        Object cheeseSelected = cheese.isSelected();

        Object picklesSelected = pickles.isSelected();

        if((Boolean)lettuceSelected == true){
            lettuceMessage = "lettuce,";
        }

        if((Boolean)cheeseSelected == true){
            cheeseMessage = "cheese,";
        }

        if((Boolean) picklesSelected){
            pickleMessage = "pickles";
        }

        String finalCondimentMessage = "You selected " + lettuceMessage + " " + cheeseMessage + " " + pickleMessage + ".";

        displayCheckBoxOption.setText(finalCondimentMessage);

        //handle the dropdown options
        Object selectedDrink = drinkSize.getSelectedItem();

        drinkMessage = "You selected a " + selectedDrink.toString() + " drink.";

        displayCheckBoxOption.setText(drinkMessage);

        //calculate order price

    }



}
