package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int gg = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - gg; j++) {
                if (array[i].equals(array[j])) {
                    String tmp = array[array.length - gg - 1];
                    array[array.length - gg - 1] = array[j];
                    array[j] = tmp;
                    gg++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - gg);
    }
}