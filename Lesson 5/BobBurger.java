/* Class: Java 2 (CIS 263AA)
 *  Author: Sachin Haldipur
 *  Lesson 5
 *  Exercise 3
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class BobBurger extends JFrame implements ActionListener, ItemListener {

    //JFrame setup and field initialization

    Font font = new Font("Arial", Font.BOLD, 16);

    //drinks
    JComboBox<String> drinkSize = new JComboBox<>();

    //burgers
    JComboBox<String> burgerSize = new JComboBox<>();

    //extras
    JCheckBox lettuce = new JCheckBox("Lettuce", false);

    JCheckBox cheese = new JCheckBox("Cheese", false);

    JCheckBox pickles = new JCheckBox("Pickles", false);

    JCheckBox[] boxes = new JCheckBox[]{lettuce, cheese, pickles};

    JLabel displayLettuceCheckBoxOption = new JLabel();

    JLabel displayCheeseCheckBoxOption = new JLabel();

    JLabel displayPickleCheckBoxOption = new JLabel();

    JLabel displayDropDownOption = new JLabel();

    //total
    JLabel displayDrinkTotal = new JLabel();

    JLabel displayCondimentTotal = new JLabel();

    JLabel displayBurgerTotal = new JLabel();

    JLabel displayTotal = new JLabel();

    final int WIDTH = 500;

    final int HEIGHT = 500;

    //burgers
    final int BURGER_PRICE = 5;

    final int DOUBLE_BURGER_PRICE = 7;

    //extras
    final int LETTUCE_PRICE = 1;

    final int CHEESE_PRICE = 2;

    final int PICKLES_PRICE = 3;

    final int[] prices = {LETTUCE_PRICE, CHEESE_PRICE, PICKLES_PRICE};

    //drinks
    final int SMALL_DRINK_PRICE = 1;

    final int MEDIUM_DRINK_PRICE = 2;

    final int LARGE_DRINK_PRICE = 3;



    public BobBurger(){

        super("Display Customer Order");


        setSize(HEIGHT, WIDTH);

        setLayout(new FlowLayout());


        //drinks dropdown
        displayDropDownOption.setFont(font);

        drinkSize.addActionListener(this);


        drinkSize.addItem("Small Drink");
        drinkSize.addItem("Medium Drink");
        drinkSize.addItem("Large Drink");

        add(drinkSize);

        //burgers dropdown
        burgerSize.addActionListener(this);

        burgerSize.addItem("Burger");
        burgerSize.addItem("Double Burger");

        add(burgerSize);

        //checkboxes
        displayLettuceCheckBoxOption.setFont(font);

        displayCheeseCheckBoxOption.setFont(font);

        displayPickleCheckBoxOption.setFont(font);

        lettuce.addItemListener(this);

        cheese.addItemListener(this);

        pickles.addItemListener(this);

        add(lettuce);
        add(cheese);
        add(pickles);

        //price totals
        displayCondimentTotal.setFont(font);
        displayDrinkTotal.setFont(font);
        displayBurgerTotal.setFont(font);
        displayTotal.setFont(font);


        /*add all controls to view*/

        //checkboxes
        add(displayLettuceCheckBoxOption);
        add(displayCheeseCheckBoxOption);
        add(displayPickleCheckBoxOption);

        //dropdown for drinks
        add(displayDropDownOption);

        //price display labels
        add(displayDrinkTotal);
        add(displayCondimentTotal);
        add(displayBurgerTotal);
        add(displayTotal);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    //event handling actions
    @Override
    public void actionPerformed(ActionEvent e){



        Object selectedDrink = drinkSize.getSelectedItem();
        Object selectedBurger = burgerSize.getSelectedItem();

        int drinkTotal = 0;
        int burgerTotal = 0;

        if(e.getSource() == drinkSize){
            //calculate drink total
            if(selectedDrink.toString() == "Small Drink"){
                drinkTotal =  SMALL_DRINK_PRICE;
            }

            if(selectedDrink.toString() == "Medium Drink"){
                drinkTotal =  MEDIUM_DRINK_PRICE;
            }

            if(selectedDrink.toString() == "Large Drink"){
                drinkTotal =  LARGE_DRINK_PRICE;
            }

            updateDrinkTotal(drinkTotal);
        }

        if(e.getSource() == burgerSize){

            //calculate burger total
            if(selectedBurger.toString() == "Burger"){
                burgerTotal = BURGER_PRICE;
            }

            if(selectedBurger.toString() == "Double Burger"){
                burgerTotal = DOUBLE_BURGER_PRICE;
            }

            updateBurgerTotal(burgerTotal);

        }



     }



    @Override
    public void itemStateChanged(ItemEvent e){

        int condimentTotal = 0;


        for(int i =0; i < boxes.length; i++){
            if(boxes[i].isSelected()){
                condimentTotal += prices[i];
            }
        }

        updateCondimentTotal(condimentTotal);
    }

    public void updateDrinkTotal(int drinkTotal){

        String totalToString = "";

        totalToString =  "Your drink total is " + Integer.toString(drinkTotal) + " dollars.";
        displayDrinkTotal.setText(totalToString);


    }

    public void updateBurgerTotal(int burgerTotal){
        String totalToString = "";

        totalToString =  "Your burger total is " + Integer.toString(burgerTotal) + " dollars.";
        displayBurgerTotal.setText(totalToString);
    }

    public void updateCondimentTotal(int condimentTotal){

        String totalToString = "";

        totalToString =  "Your condiment total is " + Integer.toString(condimentTotal) + " dollars.";
        displayCondimentTotal.setText(totalToString);


    }





}
