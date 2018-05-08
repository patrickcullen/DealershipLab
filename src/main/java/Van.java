public class Van extends Vehicle{

    private int doors;
    private int seats;

    public Van(String name, String model, double price, String colour, String engine, int wheels, int doors, int seats) {
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
