import java.util.ArrayList;
import java.util.List;

/**
 * Main class to test the functionality of mobile tariffs and custom linked list.
 */
public class Main {
    public static void main(String[] args) {
        // Creating tariff objects
        Tariff basic = new BasicTariff("Basic", 10.99, 100);
        Tariff premium = new PremiumTariff("Premium", 29.99, 50);
        Tariff family = new FamilyTariff("Family", 19.99, 75);

        // Adding tariffs to a custom linked list
        CustomLinkedList<Tariff> tariffList = new CustomLinkedList<>();
        tariffList.add(basic);
        tariffList.add(premium);
        tariffList.add(family);

        // Displaying all tariffs
        System.out.println("All Tariffs:");
        for (int i = 0; i < tariffList.size(); i++) {
            tariffList.get(i).displayDetails();
        }

        // Total number of customers
        int totalCustomers = 0;
        for (int i = 0; i < tariffList.size(); i++) {
            totalCustomers += tariffList.get(i).getCustomers();
        }
        System.out.println("\nTotal Customers: " + totalCustomers);
    }
}
