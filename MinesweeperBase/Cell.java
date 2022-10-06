/**
 * This is in charge of cells
 * 
 * @author Kyle Wiebe 
 * @author Jose Prieto
 * @version 10/05/2022
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cell implements ActionListener{
    //Variables you need to work with
    private int value;
    
    //Variables you don't need to worry about or care about.
    private JButton button;
    /**
     * This constructor is complete and does not need modification
     */
    public Cell(){
        button = new JButton(); //Create push button
        button.addActionListener(this); //Listens for button click
        button.setPreferredSize(new Dimension(20,20)); //Set size in pixels
        button.setMargin(new Insets(0,0,0,0)); //No margins
        value = 0; //Everything defaults to 0 first
    }
    /** This Method tells me if the cell is a mine.
     * 
     * @return True if it is a mine, otherwse false.
     */
    boolean isMine(){
        return this.value == 9; //If mine, return a value of 0
    }
        
    //Additional Methods may be required. Please make them yourself.
    public void makeMine(){
        /*
         * Designates a cell as a mine
         */
        value = 9;
    }
    //The following methods are used for the User Inferface. These methods are fully functional and do not need to be modified.
    public void checkCell(){
        button.setEnabled(false); //Makes clicked button unclickable
        displayValue();
    }
    public void displayValue(){
        /*
         * Shows numbers and colors if it is a mine
         */
        if(this.isMine()){
            button.setText("\u2600");
            button.setBackground(Color.RED); //If a mine, turn red
        }else if(value!=0){
            button.setText(String.valueOf(value)); //Display value if not mine
        }
    }
    public JButton getButton() {
        return button;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        checkCell();
    }
}
