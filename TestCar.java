package LR06;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "X5", "M", 3200000, 2016);
        Car c2 = new Car("Volkswagen", "Polo", "TDI", 500000, 2014);
        Car c3 = new Car("Audi", "A5", "sportback", 19000000, 2018);
        c1.println();
        c2.println();
        c3.println();
    }
}