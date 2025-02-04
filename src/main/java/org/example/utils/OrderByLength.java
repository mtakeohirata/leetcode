package org.example.utils;

import java.util.*;

public class OrderByLength {

//    Ordenação de Palavras por Tamanho:
//    Escreva um programa que receba uma lista de palavras e
//    as ordene pelo tamanho, do menor para o maior.
//    Se houver palavras com o mesmo tamanho,
//    mantenha a ordem original delas.

    public static List<String> orderByLength(List<String> unorderedList) throws Exception {
        if (unorderedList == null || unorderedList.isEmpty() ) {
            throw new Exception("List must have at least one item");
        }

        List<String> orderedList = new ArrayList<>(unorderedList);

        Collections.sort(orderedList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()- o2.length();
            }
        });

        return orderedList;
    }

}