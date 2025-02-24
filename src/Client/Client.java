package Client;

import Interface.SudokuGeneratorInterface;
import Sudoku.Sudoku;
import Sudoku.SudokuSize;

import javax.swing.JOptionPane;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    public static void main(String[] args){
        short op;

        do {
            op = Short.parseShort(JOptionPane.showInputDialog(null, """
                    ***Bienvenido al sistema generador de sudokus***
                    
                    Selecciona la opción que deseas realizar:
                    1. Matriz de 4x4
                    2. Matriz de 9x9
                    3. Matriz de 16x16
                    4. Salir
                    """));
            switch (op) {
                case 1 -> generateSudoku(SudokuSize.SMALL);
                case 2 -> generateSudoku(SudokuSize.MEDIUM);
                case 3 -> generateSudoku(SudokuSize.LARGE);
                case 4 -> JOptionPane.showMessageDialog(null, "Gracias por usar el sistema generador de sudokus");
                default -> JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        } while (op != 4);
    }

    private static void generateSudoku(SudokuSize size) {
        try {
            SudokuGeneratorInterface sudokuGenerator = (SudokuGeneratorInterface) Naming.lookup("Implement.SudokuGenerator");
            Sudoku sudoku = sudokuGenerator.chooseBoard(size);
            sudoku.printBoard();
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
