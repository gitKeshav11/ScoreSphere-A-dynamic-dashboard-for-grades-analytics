import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GarageApp {
    public static void main(String[] args) {
        HashMap<String, Customer> details = new HashMap<>();
        Scanner scr = new Scanner(System.in);
        System.out.println("----------Welcome to SODHI Garage----------");
        while (true) {
            System.out.println("Choose your Requirement:-");
            System.out.println("1. Add Customer");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int ch = scr.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter your name");
                    scr.nextLine();
                    String name = scr.nextLine();
                    System.out.println("Enter phone no.");
                    String phone = scr.next();
                    System.out.println("Enter car no.");
                    String carNo = scr.next();
                    System.out.println("Enter car model");
                    scr.nextLine();
                    String carModel = scr.nextLine();
                    details.put(carNo, new Customer(name, phone, carNo, carModel));
                    System.out.println("Customer Added Successfully....");
                    break;
                case 2:
                    System.out.println("Enter car no.");
                    String car_No = scr.next();
                    if (details.containsKey(car_No)) {
                        Invoice invoice = new Invoice(details.get(car_No));
                        while (true) {
                            System.out.println("You want to add service (yes|no):-");
                            String addChoice = scr.next();
                            if (addChoice.equalsIgnoreCase("yes")) {
                                System.out.println("Available Services:-");
                                System.out.println("1. Car Washing | Rs.200");
                                System.out.println("2. Oil Change | Rs.500");
                                System.out.println("3. Tyre Replacement | Rs.3000");
                                System.out.println("4. Wheel Alignment | Rs.300");
                                System.out.println("5. Puncture | Rs.50");
                                System.out.println("Enter your choice:-");
                                int choice = scr.nextInt();
                                if (choice >= 1 && choice <= 5) {
                                    invoice.addInvoice(choice);
                                    System.out.println("Service Added....");
                                } else {
                                    System.out.println("Invalid service choice!");
                                }
                            } else {
                                invoice.printInvoice();
                                break;
                            }
                        }
                    } else {
                        System.out.println("No Customer Added !");
                    }
                    break;
                case 3:
                    System.out.println("Exiting....");
                    scr.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");

            }
        }
    }
}