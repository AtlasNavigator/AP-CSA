/**
 * This is the graphical part of minesweeper.
 * 
 * @author Jose Prieto
 * @version 10/05/2022
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
        this.rows = row;
        this.columns = col;
        this.board = new Cell[row * col]; //Board size is row * col

        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());

        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard(){
        this(10,10); //Default settings; 10x10 board
    }

    public void addMines(int mines) throws Exception{
        //Spit error/game over when you click on a mine
        //Write array with random indexes
        
        
    }

    public void addNums(){
        
    }
    
    public static void boardArray(){
        
    }
    
    /**
     *  This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        System.out.println(board);
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
