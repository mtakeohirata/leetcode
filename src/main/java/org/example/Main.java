package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
         * -- Iteradores
         *  - Sintaxe
         *  - Casos de uso
         *
         * 1. For
         *  -
         * 2. Foreach
         * -
         * 3. While
         * -
         */
//        for_iterator();
        foreach_iterator();

    }

    /*
    - Quando queremos ter controle de quantas iterações,
    baseado em algum número (seja tamanho lista ou numero pré-definido
     */
    public static void for_iterator(){
        List<String> lista_poc = new ArrayList<>();
        lista_poc.add("asdasd"+"takeo");
        lista_poc.add("qwqw"+"takeo");

        for(int i = 0; i <= lista_poc.size() -1; i++) {
            String palavra = lista_poc.get(i);
            System.out.println(palavra);
        }

        for (int i = 1; i <= 10; i++){
            System.out.println("Mostre a sequencia" + (i));
        }



    }

    /**
     * - Uso em lista onde não preciso saber o indice
     */
    public static void foreach_iterator (){
        List<String> lista_poc = new ArrayList<>();
        lista_poc.add("asdasd"+"takeo");
        lista_poc.add("qwqw"+"takeo");

        for (String s : lista_poc)
            System.out.println(s);

    }
    private void while_iterator(){
        System.out.println();
    }


}

class PessoaAcademia {
    String nome;
    boolean ativo;
}