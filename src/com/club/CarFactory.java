package com.club;

public class CarFactory {
    public static Car createMercedes() {
        return new Mercedes();
    }
    public static Car createBMW() {
        return new BMW();
    }
    public static Lada createLada() {
        return new Lada();
    }
    public static Car createMoskvich() {
        return new Moskvich();
    }

}
