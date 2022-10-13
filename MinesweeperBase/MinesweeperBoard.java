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
    int mines;
    public MinesweeperBoard(int row, int col, int mines){
        //Put the constructor here.
        this.rows = row;
        this.columns = col;
        this.mines = mines;
        this.board = new Cell[row * col]; //Board size is row * col

        System.out.println(mines); //Making sure why addMines isnt working
        System.out.println("");

        //These pieces are for the GUI, written by Mr.Wiebe
        JFrame frame = new JFrame();
        frame.add(addCells());

        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // Add the mines, in the correct order
        try{
            System.out.println(mines);
            addMines(mines); //Working as of 10/13
        } catch (Exception e){} 
    }

    public MinesweeperBoard(){
        this(10,10,10); //Default settings; 10x10 board, 10 mines
    }

    public void addMines(int mines) throws Exception{
        //Spit error/game over when you click on a mine
        //Write random number gen that modifies random indecies (cells)
        int i = mines;
        System.out.println("i is defined as: " + i);
        if (i < 0){
            //Make sure i isn't negative
            throw new Exception ("Something is wonky, i is :" + i);
        } else if (i >= rows * columns) {
            //Make sure mine amount doesn't exceed amount of cells
            throw new Exception ("Too many mines. At least one free cell is required");
        } else{
            while (i > 0){
                System.out.println("i is defined as: " + i);
                int minePlace = (int)(Math.random() * (rows * columns - 1));
                System.out.println(minePlace);
                System.out.println("i is defined as: " + i);
                board[minePlace].makeMine(); //Calls mutator in cell class to make mine
                System.out.println("i is defined as: " + i);
                board[minePlace].checkCell();
                System.out.println("i is defined as: " + i);
                i--;
                System.out.println("i is defined as: " + i);
                System.out.println();
                System.out.println(i > 0); //Come back to exceptions tomorrow
            }
        }
    }

    public void addNums(){
        // Adds numbers to cells surrounding mines
    }

    /**
     *  This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        System.out.println(board);
        for(int i = 0; i < rows; i++){
            System.out.println(); //Prints [i]
            for (int j = 0; j < columns; j++){
                System.out.print("[" + (j + i * columns) + "]");
            }
        }
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
