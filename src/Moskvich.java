public class Moskvich implements Cars{
    @Override
    public void accelerate() {
        System.out.println("Moskvich разгоняется за 14 сек до 100");
    }
    @Override
    public void brake() {
        System.out.println("Moskvich тормозит со 100 до 0 за 11 сек");
    }
    @Override
    public double getPrice() {
        return 12000;
    }
    @Override
    public int getMaxSpeed() {
        return 190;
    }
    @Override
    public boolean isForeign() {
        return false;
    }
}
