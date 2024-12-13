/**
 * Represents a family mobile tariff.
 * This tariff is designed for family plans with multiple users.
 */
public class FamilyTariff extends Tariff {

    /**
     * Constructor to initialize a family tariff.
     *
     * @param name            the name of the tariff
     * @param subscriptionFee the subscription fee
     * @param customers       the number of customers
     */
    public FamilyTariff(String name, double subscriptionFee, int customers) {
        super(name, subscriptionFee, customers);
    }

    @Override
    public void displayDetails() {
        System.out.println("Family Tariff: " + getName() +
                ", Subscription Fee: $" + getSubscriptionFee() +
                ", Customers: " + getCustomers());
    }
}
