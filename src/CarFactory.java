public class CarFactory {
    public static Cars createMercedes() {
        return new Mercedes();
    }
    public static Cars createBMW() {
        return new BMW();
    }
    public static Lada createLada() {
        return new Lada();
    }
    public static Cars createMoskvich() {
        return new Moskvich();
    }

}
