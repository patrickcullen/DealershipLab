public abstract class Vehicle {

    String name;
    String model;
    double price;
    String colour;
    String engine;
    int wheels;

    public Vehicle(String name, String model, double price, String colour, String engine, int wheels) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }


}
