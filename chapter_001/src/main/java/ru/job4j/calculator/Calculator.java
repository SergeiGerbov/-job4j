package ru.job4j.calculator;

/**
 * Калькулятор.
 */
public class Calculator {

    /**
     *
     * @param first первй параметр.
     * @param second второй парраметр.
     * @return результат.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     *
     * @param first первый парметр.
     * @param second второй парметр.
     * @return результат.
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     *
     * @param first первый парметр.
     * @param second втрой парметр.
     * @return результат.
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     *
     * @param first перый параметр
     * @param second второй параметр
     * @return результат вычесления
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}