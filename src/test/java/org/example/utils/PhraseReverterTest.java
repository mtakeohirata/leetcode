package org.example.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PhraseReverterTest {


    @Test
    public void whenValidPhrase_mustRevert_successfully(){
        final String phrase = "O ceu e azul";
        final String phraseExpected = "azul e ceu O";
        final String phraseReverted = PhraseReverter.reverse(phrase);

        assertEquals(phraseExpected, phraseReverted);
    }


}