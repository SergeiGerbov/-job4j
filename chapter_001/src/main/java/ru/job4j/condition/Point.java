package ru.job4j.condition;

public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
        double first1 = Math.pow(x2 - x1, 2);
        double first2 = Math.pow(y2 - y1, 2);
        return Math.sqrt(first1 + first2);
    }

}
