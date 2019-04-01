package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sorte = new BubbleSort();
        int[] input = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = sorte.sort(input);
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));

    }

    @Test
    public void whenSortArrayWithTenElementsThenSortedArrayzero() {
        BubbleSort sorte = new BubbleSort();
        int[] input = new int[]{1, -5, 4, 2, -3, 1, 7, 8, 0, 5};
        int[] result = sorte.sort(input);
        int[] expect = new int[]{-5, -3, 0, 1, 1, 2, 4, 5, 7, 8};
        assertThat(result, is(expect));

    }
}