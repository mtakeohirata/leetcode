package org.example.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciTest {

    /**
     * Deve-se receber um input inteiro, onde seu valor representa quantidade de itens
     * desejados no retorno da lista fibonacci, ex:
     * input = 4
     * fibonacci = [1,1,2,3]
     * 
     * - Input diferente de inteiro, retornar exceção
     * - Números negativos no input, jogar exceção
     * - Número zero no input, retornar lista vazia
     */

    @Test
    public void whenValidInput_mustReturnFibonacciValues(){
        final int mockedInput = 10;
        final List<Integer> expectedResponse = Arrays.asList(1,1,2,3,5,8,13,21,34,55);

        // TODO assumir que seja <= 2 o input

        // Assumir que seja > 2 o input
        List<Integer> initialFibonacci = new ArrayList<>(Arrays.asList(1,1));
        for (int i = 2; i < mockedInput; i++){
            final Integer v1 = initialFibonacci.get(i-2);
            final Integer v2 = initialFibonacci.get(i-1);
            initialFibonacci.add(v1 + v2);
        }
        System.out.println(initialFibonacci);
        Assert.assertEquals(expectedResponse, initialFibonacci);
    }
}
