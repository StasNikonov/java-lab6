/**
 * Represents a premium mobile tariff.
 * This tariff offers additional benefits and higher subscription fees.
 */
public class PremiumTariff extends Tariff {

    /**
     * Constructor to initialize a premium tariff.
     *
     * @param name            the name of the tariff
     * @param subscriptionFee the subscription fee
     * @param customers       the number of customers
     */
    public PremiumTariff(String name, double subscriptionFee, int customers) {
        super(name, subscriptionFee, customers);
    }

    @Override
    public void displayDetails() {
        System.out.println("Premium Tariff: " + getName() +
                ", Subscription Fee: $" + getSubscriptionFee() +
                ", Customers: " + getCustomers());
    }
}
