/**
 * Represents a basic mobile tariff.
 * This tariff is designed for minimal users.
 */
public class BasicTariff extends Tariff {

    /**
     * Constructor to initialize a basic tariff.
     *
     * @param name            the name of the tariff
     * @param subscriptionFee the subscription fee
     * @param customers       the number of customers
     */
    public BasicTariff(String name, double subscriptionFee, int customers) {
        super(name, subscriptionFee, customers);
    }

    @Override
    public void displayDetails() {
        System.out.println("Basic Tariff: " + getName() +
                ", Subscription Fee: $" + getSubscriptionFee() +
                ", Customers: " + getCustomers());
    }
}
