package org.example.utils;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {

    /**
     * Validação de Sudoku:
     * Implemente um algoritmo que valide se uma matriz 9x9 representa um
     * jogo de Sudoku válido.
     * As regras do Sudoku devem ser respeitadas:
     * cada linha, coluna e bloco 3x3 deve conter todos
     * os números de 1 a 9 sem repetição.
     * @param sudoku
     * @return
     */
    public static boolean validate(Integer[][] sudoku){
        for (int l = 0; l < sudoku.length; l++) {
            Set<Integer> line = new HashSet<>();
            for (int c = 0; c < sudoku[l].length; c++) {
                if (line.contains(sudoku[l][c]) || sudoku[l][c] > 9 || sudoku[l][c] < 1){
                    return false;
                } else {
                    line.add(sudoku[l][c]);
                }
            }
        }

        for (int l = 0; l < sudoku.length; l++) {
            Set<Integer> col = new HashSet<>();
            for (int c = 0; c < sudoku[l].length; c++) {
                if (col.contains(sudoku[c][l]) || sudoku[c][l] > 9 || sudoku[c][l] < 1){
                    return false;
                } else {
                    col.add(sudoku[c][l]);
                }
            }
        }
        return true;
    }

}
