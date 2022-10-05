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
    int value;
    
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
        value = 0; //First click is always clear
    }
    /** This Method tells me if the cell is a mine.
     * 
     * @return True if it is a mine, otherwse false.
     */
    boolean isMine(){
        return this.value == 0;
    }
    
    
    //Additional Methods may be required. Please make them yourself.
    
    //The following methods are used for the User Inferface. These methods are fully functional and do not need to be modified.
    public void checkCell(){
        button.setEnabled(false);
        displayValue();
    }
    public void displayValue(){
        if(this.isMine()){
            button.setText("\u2600");
            button.setBackground(Color.RED);
        }else if(value!=0){
            button.setText(String.valueOf(value));
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
