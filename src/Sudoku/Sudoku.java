package Sudoku;

import javax.swing.JOptionPane;
import java.io.Serializable;

public class Sudoku implements Serializable {
    private final int[][] board;

    public Sudoku(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }

    public void printBoard() {
        int size = board.length;              // 4, 9, or 16
        int subGridSize = (int) Math.sqrt(size); // 2, 3, or 4

        // 4 characters per cell: 3 for the digits + 1 space => "%3d "
        int cellWidth = 4;
        // Each vertical boundary "| " is 2 characters
        int boundaryWidth = 2;
        // Number of vertical subgrid boundaries in a row
        int subgridBoundaries = (size / subGridSize) - 1;
        // Calculate total row width for the dashed separator
        int rowWidth = (cellWidth * size) + (boundaryWidth * subgridBoundaries);

        String horizontalLine = "-".repeat(rowWidth) + "\n";
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < size; i++) {
            // Print a horizontal separator after every subGridSize rows (except the first)
            if (i % subGridSize == 0 && i != 0) {
                s.append(horizontalLine);
            }
            for (int j = 0; j < size; j++) {
                // Print a vertical boundary after every subGridSize columns (except the first)
                if (j % subGridSize == 0 && j != 0) {
                    s.append("| ");
                }
                // 3 digits right-aligned plus 1 space => total 4 chars
                s.append(String.format("%3d ", board[i][j]));
            }
            s.append("\n");
        }

        JOptionPane.showMessageDialog(null, s.toString());
    }





}
