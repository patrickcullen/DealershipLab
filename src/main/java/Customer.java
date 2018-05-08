public class Customer {

    private double cash;
    private String credit;

    public Customer(double cash, String credit) {
        this.cash = cash;
        this.credit = credit;
    }

    public double getCash() {
        return cash;
    }

    public String getCredit() {
        return credit;
    }
}
