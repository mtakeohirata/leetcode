package org.example.utils;

public class PalindromeValidator {
    /**
     * Verificação de Palíndromo:
     * Escreva um programa que verifique se uma string é um palíndromo,
     * ou seja, se ela permanece a mesma quando lida de trás para frente.
     * Desconsidere espaços e caracteres não alfanuméricos.
     * @param palindrome
     * @return
     */
    public static boolean validate(final String palindrome){
        StringBuilder sbReversed = new StringBuilder();
        for (int i = palindrome.length() - 1; i >= 0 ; i--) {
            sbReversed.append(palindrome.charAt(i));
        }
        final String reversed = sbReversed.toString();

        return palindrome.equals(reversed);
    }
}
