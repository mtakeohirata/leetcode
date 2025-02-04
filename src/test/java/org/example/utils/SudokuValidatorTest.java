package org.example.utils;

import org.junit.Assert;
import org.junit.Test;

public class SudokuValidatorTest {

    @Test
    public void whenValidSudoku_mustReturnTrue(){
        Integer[][] sudoku = new Integer[9][9];
        fillValidSudoku(sudoku);
        final boolean validSudoku = SudokuValidator.validate(sudoku);

        Assert.assertEquals(true, validSudoku);
    }

    @Test
    public void whenInvalidSudoku_mustReturnFalse(){
        Integer[][] sudoku = new Integer[9][9];
        fillInvalidSudoku(sudoku);
        final boolean validSudoku = SudokuValidator.validate(sudoku);

        Assert.assertEquals(false, validSudoku);
    }

    public static void fillInvalidSudoku(Integer[][] sudoku) {
        sudoku[0] = new Integer[]{1, 1, 1, 1, 1, 1, 1, 1, 1 };
        sudoku[1] = new Integer[]{1, 7, 2, 1, 9, 5, 3, 4, 8};
        sudoku[2] = new Integer[]{1, 9, 8, 3, 4, 2, 5, 6, 7};
        sudoku[3] = new Integer[]{1, 5, 9, 7, 6, 1, 4, 2, 3};
        sudoku[4] = new Integer[]{1, 2, 6, 8, 5, 3, 7, 9, 1};
        sudoku[5] = new Integer[]{1, 1, 3, 9, 2, 4, 8, 5, 6};
        sudoku[6] = new Integer[]{1, 6, 1, 5, 3, 7, 2, 8, 4};
        sudoku[7] = new Integer[]{1, 8, 7, 4, 1, 9, 6, 3, 5};
        sudoku[8] = new Integer[]{1, 4, 5, 2, 8, 6, 1, 7, 9};
    }

    public static void fillValidSudoku(Integer[][] sudoku) {
        sudoku[0] = new Integer[]{5, 3, 4, 6, 7, 8, 9, 1, 2};
        sudoku[1] = new Integer[]{6, 7, 2, 1, 9, 5, 3, 4, 8};
        sudoku[2] = new Integer[]{1, 9, 8, 3, 4, 2, 5, 6, 7};
        sudoku[3] = new Integer[]{8, 5, 9, 7, 6, 1, 4, 2, 3};
        sudoku[4] = new Integer[]{4, 2, 6, 8, 5, 3, 7, 9, 1};
        sudoku[5] = new Integer[]{7, 1, 3, 9, 2, 4, 8, 5, 6};
        sudoku[6] = new Integer[]{9, 6, 1, 5, 3, 7, 2, 8, 4};
        sudoku[7] = new Integer[]{2, 8, 7, 4, 1, 9, 6, 3, 5};
        sudoku[8] = new Integer[]{3, 4, 5, 2, 8, 6, 1, 7, 9};
    }

}