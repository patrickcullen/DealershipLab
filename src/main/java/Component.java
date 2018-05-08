public abstract class Component {

    String brand;
    double size;
    String type;

    public Component(String brand, double size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
