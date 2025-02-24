package Implement;

import Interface.SudokuGeneratorInterface;
import Sudoku.Sudoku;
import Sudoku.SudokuSize;
import Sudoku.SudokuRepository;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SudokuGenerator extends UnicastRemoteObject implements SudokuGeneratorInterface {

    public SudokuGenerator() throws RemoteException {
        super();
    }

    @Override
    public Sudoku chooseBoard(SudokuSize size) throws RemoteException {
        Sudoku[] puzzles = SudokuRepository.getPuzzlesBySize(size);
        int randomIndex = (int) (Math.random() * puzzles.length);
        return puzzles[randomIndex];
    }
}
