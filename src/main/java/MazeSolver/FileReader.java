package MazeSolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {

    private int[][] map;
    private String fileName;
    private int numOfRows;
    private int numOfColumns;
    private int startPositionCol; //todo The start index of the 2 "Start Point" colIndex
    private int startPositionRow;// todo Start index of the 2 "start point" row Index

    public FileReader(String fileName, int numOfRows, int numOfColumns) {
        this.fileName = fileName;
        this.numOfColumns = numOfColumns;
        this.numOfRows = numOfRows;
        this.map = new int[numOfRows][numOfColumns];
    }

    public void parseFile() {
        try {
            Scanner scanner = new Scanner(new File(this.fileName));

            for(int i = 0; i < this.numOfRows; i++) {
                for (int j = 0; j < this.numOfColumns; j++) {
                    map[i][j] = scanner.nextInt(); //todo Read the Integers from the File

                    if (map[i][j] == 2) { //todo We have found the 2 so save the col and row indexes
                        startPositionCol = j;
                        startPositionRow = i;
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int[][] getMap() {
        return this.map;
    }

    public int getStartPositionCol() {
        return startPositionCol;
    }

    public void setStartPositionCol(int startPositionCol) {
        this.startPositionCol = startPositionCol;
    }

    public int getStartPositionRow() {
        return startPositionRow;
    }

    public void setStartPositionRow(int startPositionRow) {
        this.startPositionRow = startPositionRow;
    }
}
