package Interface;

import Sudoku.Sudoku;
import Sudoku.SudokuSize;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SudokuGeneratorInterface extends Remote {
    Sudoku chooseBoard(SudokuSize size) throws RemoteException;
}
