package Custom_Classes;

public class UsingCar {
    public static void main(String[] args) {

        Car carFirst = new Car();
        carFirst.fuelLevel = 20;
        carFirst.model = "Fiat";
        carFirst.year = 2005;
        carFirst.color = "White";
        carFirst.drive();
        System.out.println("Is the gas getting low? " + carFirst.isLow());
        carFirst.fillTank();
    }
}
