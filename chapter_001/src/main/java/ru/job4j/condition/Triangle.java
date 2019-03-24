package ru.job4j.condition;

public class Triangle {

    /**
     * Метод вычисления периметра по длинам сторон.
     * Формула.
     * (a + b + c) / 2
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Полупериметр.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;


    }

    /**
     * Метод должен вычислить прощадь треугольканива.
     * Формула.
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть прощадь, если треугольник существует или -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = 0;
        double ab = new Point().distance(x1, y1, x2, y2);
        double bc = new Point().distance(x2, y2, x3, y3);
        double ac = new Point().distance(x1, y1, x3, y3);
        double p = period(ab, bc, ac);
        if (this.exist(ab, bc, ac)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param ab Длина от точки a b.
     * @param bc Длина от точки a c.
     * @param ac Длина от точки b c.
     * @return
     */
    private boolean exist(double ab, double bc, double ac) {
        return (((ab + bc) > ac) && ((bc + ac) > ab) && ((ac + ab) > bc));
    }
}