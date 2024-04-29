
import java.util.HashMap;
import java.util.Scanner;

        public class CondoManagement {

            private static HashMap<String, Owner> condos = new HashMap<>(); // Stores condo details with unit number as key

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int choice;

                do {
                    System.out.println("\nCondo Management System");
                    System.out.println("1. Setup Condo");
                    System.out.println("2. Buy Condo");
                    System.out.println("3. Sell Condo");
                    System.out.println("4. Search Condo Owner");
                    System.out.println("5. Exit");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            setupCondo();
                            break;
                        case 2:
                            buyCondo();
                            break;
                        case 3:
                            sellCondo();
                            break;
                        case 4:
                            searchCondoOwner();
                            break;
                        case 5:
                            System.out.println("Exiting the system...");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                } while (choice != 5);

                scanner.close();
            }

            private static void setupCondo() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter floor number: ");
                int floor = scanner.nextInt();
                System.out.print("Enter room number: ");
                int room = scanner.nextInt();

                String unitNumber = floor + "-" + room; // Combine floor and room number

                if (condos.containsKey(unitNumber)) {
                    System.out.println("Condo already exists!");
                } else {
                    // Prompt for owner details and create Owner object
                    Owner owner = createOwnerDetails();
                    condos.put(unitNumber, owner);
                    System.out.println("Condo added successfully!");
                }
            }

            private static void buyCondo() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter unit number (floor-room): ");
                String unitNumber = scanner.nextLine();

                if (condos.containsKey(unitNumber)) {
                    System.out.println("Condo details:");
                    System.out.println(condos.get(unitNumber)); // Display owner details

                    // Implement logic to handle purchase (e.g., update owner details)
                } else {
                    System.out.println("Condo not found!");
                }
            }

            private static void sellCondo() {
                // Implement logic to handle condo selling process
                System.out.println("Sell condo functionality not yet implemented.");
            }

            private static void searchCondoOwner() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter unit number (floor-room): ");
                String unitNumber = scanner.nextLine();

                if (condos.containsKey(unitNumber)) {
                    System.out.println("Owner details:");
                    System.out.println(condos.get(unitNumber)); // Display owner details
                } else {
                    System.out.println("Condo not found!");
                }
            }

            private static Owner createOwnerDetails() {
                // Implement logic to capture owner details (name, contact, etc.) and create an Owner object
                Owner owner = new Owner(); // Replace with actual implementation
                return owner;
            }
        }
        class Owner {
            // Define properties like name, contact information, etc.
            private String name;
            private String contact;

            // Implement getters and setters (if needed)

            @Override
            public String toString() {
                return "Owner: " + name + "\nContact: " + contact;
            }
        }

