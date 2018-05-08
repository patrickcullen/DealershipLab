public class Car extends Vehicle {

    private int doors;
    private int seats;

    public Car(String name, String model, double price, String colour, String engine, int wheels, int doors, int seats) {
        super(name, model, price, colour, engine, wheels);
        this.doors = doors;
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }
}
