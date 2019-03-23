package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value ) {
        return value / 70;
    }
    /**
     * Конвертируем евро в рубли .
     * @param value евро.
     * @return Рубли.
     */
    public int  EuroToRubl(int value ) {
        return value * 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60 ;
    }
    /**
     * Конвертируем долллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */
    public int DollarToRubl(int value) {
        return value * 60 ;
    }

}