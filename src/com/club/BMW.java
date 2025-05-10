package com.club;

public class BMW implements Car {
    @Override
    public void accelerate() {
        System.out.println("com.club.BMW разгоняется за 5 сек до 100");
    }
    @Override
    public void brake() {
        System.out.println("com.club.BMW тормозит со 100 до 0 за 5 сек");
    }
    @Override
    public int getPrice() {
        return 45000;
    }
    @Override
    public int getMaxSpeed() {
        return 260;
    }
    @Override
    public boolean isForeign() {
        return true;
    }
}
