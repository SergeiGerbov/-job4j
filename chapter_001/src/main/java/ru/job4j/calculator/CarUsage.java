package ru.job4j.calculator;
public class CarUsage {
    public static void main(String[] args) {
        Car opel = new Car();
        boolean driving = opel.canDrive();
        System.out.println("Can you drive" + driving);
        System.out.println("Im going to a gas station");
        int gas = 15;
        opel.fill(gas);
        driving = opel.canDrive();
        System.out.println("Can you drive now ?:" + driving);
        System.out.println("Im going to Russian prostitutes");
        System.out.println("I'ts 10 kilometers from here");
        int distance = 10;
        opel.drive(distance);
        opel.gasinfo();
    }

}
