/**
 * This is the graphical part of minesweeper, now with 2D arrays!
 * 
 * @author Jose Prieto
 * @version 10/24/2022
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard{
    Cell[][] board;
    int rows;
    int columns;
    int mines;
    public MinesweeperBoard(int row, int col, int mines){
        //Put the constructor here.
        this.rows = row;
        this.columns = col;
        this.mines = mines;
        this.board = new Cell[row][col]; //Sets array(s) sizes

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
            // System.out.println(mines);
            addMines(mines); //Working as of 10/13
        } catch (Exception e){}
        
        addNums(); //Adds numbers to cells surrounding mines
    }

    public MinesweeperBoard(){
        this(10,10,10); //Default settings; 10x10 board, 10 mines
    }

    public void addMines(int mines) throws Exception{
        //Spit error/game over when you click on a mine
        //Write random number gen that modifies random indecies (cells)
        int i = mines;
        if (i < 0){
            //Make sure i isn't negative
            System.out.println("Something is wonky, i is: " + i);
            throw new Exception ("Something is wonky, i is :" + i);
        } else if (i >= rows * columns) {
            //Make sure mine amount doesn't exceed amount of cells
            System.out.println("Too many mines. At least one free cell is required.");
            throw new Exception ("Too many mines. At least one free cell is required");
        } else{
            while (i > 0){
                //Place mines at random indecies
                int minePlace = (int)(Math.random() * (rows * columns - 1));
                // System.out.println(minePlace);
                if (board[minePlace][0].cellAccessor() == 9){
                    continue; //Prevent repeated minePlace spots
                } else {
                    board[minePlace][0].makeMine(); //Calls mutator in cell class to make mine
                    i--;
                    System.out.println();
                    System.out.println(i > 0);
                }
            }
        }
    }

    public void addNums(){
        // Adds numbers to cells surrounding mines
        //Begin to do addNums 10/17

        for (int c = 0; c < rows * columns; c++){
            boolean topExists = c - columns >= 0; //Does a top exist?
            boolean bottomExists = c + columns < columns * rows; //Does bottom exist?
            boolean rightExists = (c + 1) % columns != 0; //Does the right exist?
            boolean leftExists = c % columns != 0; //Is there a cell to the left?

            if (board[c][0].isMine()){
                continue; //Skip this if the cell is a mine
            } 

            int count = 0; //Set a counter to count mines surrounding

            if (topExists && board[c - columns][0].isMine()){
                //Condition if mine is on top
                count++;
            }

            if (bottomExists && board[c + columns][0].isMine()){
                //If mine on bottom
                count++;
            }

            if (rightExists && board[c + 1][0].isMine()){
                //If mine to the right
                count++;
            }

            if (leftExists && board[c - 1][0].isMine()){
                //If mine to the left
                count++;
            }

            if (topExists && leftExists && board[c - columns - 1][0].isMine()){
                //If mine to the top left
                count++;
            }

            if (topExists && rightExists && board[c - columns + 1][0].isMine()){
                //If mine to the top right
                count++;
            }

            if (bottomExists && leftExists && board[c + columns - 1][0].isMine()){
                //If mine to the bottom left
                count++;
            }

            if (bottomExists && rightExists && board[c + columns + 1][0].isMine()){
                //If mine to the bottom right
                count++;
            }

            board[c][0].cellModifier(count);
        }

    }

    /**
     *  This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        // For test purposes
        System.out.println(board);
        for(int i = 0; i < rows; i++){
            System.out.println(); //Prints [i]
            for (int j = 0; j < columns; j++){
                int index = j + i * columns;
                if (board[index][j].isMine() == true){
                    System.out.print("[X]"); //if there is a mine, print [X]
                } else {
                    // System.out.print("[" + (j + i * columns) + "]");
                    System.out.print("[" + board[index][j].cellAccessor() + "]");
                }
            }
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
            board[i][0]= new Cell();
            panel.add(board[i][0].getButton());
        }
        return panel;
    }

}
