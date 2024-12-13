/**
 * Represents a generalized mobile tariff.
 * This class serves as a base for different types of tariffs.
 */
public abstract class Tariff {
    private String name;
    private double subscriptionFee;
    private int customers;

    /**
     * Constructor to initialize a tariff.
     *
     * @param name            the name of the tariff
     * @param subscriptionFee the subscription fee for the tariff
     * @param customers       the number of customers subscribed
     */
    public Tariff(String name, double subscriptionFee, int customers) {
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public int getCustomers() {
        return customers;
    }

    /**
     * Displays tariff details.
     */
    public abstract void displayDetails();
}
