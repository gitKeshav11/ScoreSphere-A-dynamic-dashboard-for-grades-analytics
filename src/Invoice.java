import java.util.ArrayList;
import java.util.List;

public class Invoice {
    Customer customer;
    private double total;
    public List<Services> servicesList = new ArrayList<>();

    public Invoice(Customer customer) {
        this.customer = customer;
        this.total = 0.0;
    }

    public void addInvoice(int ch) {
        switch (ch) {
            case 1:
                servicesList.add(new Services("Car Washing", 200));
                total += 200;
                break;
            case 2:
                servicesList.add(new Services("Oil Change", 500));
                total += 500;
                break;
            case 3:
                servicesList.add(new Services("Tyre Replacement", 3000));
                total += 3000;
                break;
            case 4:
                servicesList.add(new Services("Wheel Alignment", 300));
                total += 300;
                break;
            case 5:
                servicesList.add(new Services("Puncture", 50));
                total += 50;
                break;
        }
    }

    public void printInvoice() {
        System.out.println("\n---------- Tax Invoice ----------");
        System.out.println("Customer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Car Number: " + customer.getCarNo());
        System.out.println("Car Model: " + customer.getCarModel());

        System.out.println("\nServices:-");
        for (int i = 0; i < servicesList.size(); i++) {
            System.out.println((i + 1) + ". " + servicesList.get(i).getServiceName() + " | Rs." + servicesList.get(i).getPrice());
        }

        System.out.println("\nTotal Amount (incl. taxes): Rs." + total);
        System.out.println("\n---------- Thank You, Visit Again! ----------\n");
    }
}
