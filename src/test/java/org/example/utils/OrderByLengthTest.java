package org.example.utils;

import org.junit.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class OrderByLengthTest {

    @Test
    public void whenValidList_mustOrderByLength_successfully() throws Exception {
        final List<String> unorderedList = Arrays.asList("333", "22", "666666", "1");
        final List<String> orderedList = OrderByLength.orderByLength(unorderedList);

        assertNotEquals(orderedList, unorderedList);
    }



}