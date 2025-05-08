    public class Mercedes implements Cars {
        @Override
        public void accelerate() {
            System.out.println("Mercedes разгоняется за 7 сек до 100");
        }
        @Override
        public void brake() {
            System.out.println("Mercedes тормозит со 100 до 0 за 6 сек");
        }
        @Override
        public double getPrice() {
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

