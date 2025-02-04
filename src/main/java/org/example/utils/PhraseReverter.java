package org.example.utils;

import java.util.Arrays;
import java.util.List;

public class PhraseReverter {

    /**
     * Reversão de Palavras em uma Frase:
     * Escreva uma função que receba uma frase como entrada e
     * reverta a ordem das palavras. Por exemplo, "O céu é azul"
     * deve ser transformado em "azul é céu O".
     * @param phrase
     * @return
     */
    public static String reverse(final String phrase){
        final List<String> splittedSpaces = Arrays.asList(phrase.split(" "));

        String revertedPhrase = "";
        for (int i = splittedSpaces.size() - 1; i >= 0; i--) {
            revertedPhrase += splittedSpaces.get(i) + " ";
        }
        return revertedPhrase.substring(0, revertedPhrase.length()-1);
    }
}
