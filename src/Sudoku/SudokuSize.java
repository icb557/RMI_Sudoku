package Sudoku;

public enum SudokuSize {
    SMALL(4),
    MEDIUM(9),
    LARGE(16);

    private final int dimension;

    SudokuSize(int dimension) {
        this.dimension = dimension;
    }

    public int getDimension() {
        return dimension;
    }
}
