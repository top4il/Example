public class Lada implements Cars {
    @Override
    public void accelerate() {
        System.out.println("Lada разгоняется за 15 сек до 100");
    }
    @Override
    public void brake() {
        System.out.println("Lada тормозит со 100 до 0 за 12 сек");
    }
    @Override
    public double getPrice() {
        return 10000;
    }
    @Override
    public int getMaxSpeed() {
        return 180;
    }
    @Override
    public boolean isForeign() {
        return false;
    }
}
