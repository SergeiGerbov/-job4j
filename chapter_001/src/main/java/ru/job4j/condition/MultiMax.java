package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        return Math.max(first, Math.max(second, third));
    }
}