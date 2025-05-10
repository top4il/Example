package com.club;

public class Mercedes implements Car {
        @Override
        public void accelerate() {
            System.out.println("com.club.Mercedes разгоняется за 7 сек до 100");
        }
        @Override
        public void brake() {
            System.out.println("com.club.Mercedes тормозит со 100 до 0 за 6 сек");
        }
        @Override
        public int getPrice() {
            return 80000;
        }
        @Override
        public int getMaxSpeed() {
            return 240;
        }
        @Override
        public boolean isForeign() {
            return true;
        }
    }

