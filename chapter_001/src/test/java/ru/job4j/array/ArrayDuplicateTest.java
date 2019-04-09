package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate remov = new ArrayDuplicate();
            String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
            String[] result = remov.remove(input);
            String[] expect = {"Привет", "Мир", "Супер"};

            assertThat(result, is(expect));


    }
}
