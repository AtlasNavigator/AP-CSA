
/**
 * This is the graphical part of minesweeper.
 * 
 * @author Jose Prieto
 * @version 10/04/2022
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard{
    Cell[] board;
    int rows;
    int columns;
    public MinesweeperBoard(int row, int col){
        //Put the constructor here.
        
        
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public MinesweeperBoard(){
	this(10,10);
    }

    public void addMines(int mines) throws Exception{
        
    }

    public void addNums(){
        
    }
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        
    }
    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
                board[i]= new Cell();
                panel.add(board[i].getButton());
        }
        return panel;
    }

}
