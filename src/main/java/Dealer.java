import java.util.ArrayList;

public class Dealer implements Buyable {

    String name;
    private ArrayList<Car> cars;
    private ArrayList<Van> vans;
    private ArrayList<Motorbike> motorbikes;


    public Dealer(String name, ArrayList<Car> cars, ArrayList<Van> vans, ArrayList<Motorbike> motorbikes) {
        this.name = name;
        this.cars = cars;
        this.vans = vans;
        this.motorbikes = motorbikes;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Van> getVans() {
        return vans;
    }

    public ArrayList<Motorbike> getMotorbikes() {
        return motorbikes;
    }
}
