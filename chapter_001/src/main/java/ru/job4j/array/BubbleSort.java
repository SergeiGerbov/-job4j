package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        int i, j;
        for (i = array.length - 1; i > 1; i--)
            for (j = 0; j < i; j++)
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }

        return array;
    }
}
