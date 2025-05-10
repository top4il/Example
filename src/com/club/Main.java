package com.club;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[] {
                CarFactory.createBMW(),
                CarFactory.createMercedes(),
                CarFactory.createLada(),
                CarFactory.createMoskvich(),

        };
        System.out.println("Цикл FOR");
        System.out.println("com.club.BMW");
        for (int i = 0; i < cars.length; i++) {
            cars[i].accelerate();
            System.out.println("Цена: " + cars[i].getPrice());
        }
        System.out.println("Цикл WHILE");
        int i = 0;
        while (i < cars.length) {
            System.out.println("Иномарка? " + cars[i].isForeign());
            i++;
        }
        System.out.println("Цикл DO-WHILE");
        int j = 0;
        do {
            cars[j].accelerate();
            j++;
        } while (j < cars.length);
    }
}
