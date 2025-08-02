package vehileManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10); // Set 10 total slots
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== Vehicle Parking System ===");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. View Parked Vehicles");
            System.out.println("4. View Available Slots");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter vehicle number: ");
                    String number = scanner.nextLine();
                    System.out.print("Enter type (2W / 4W): ");
                    String type = scanner.nextLine();
                    Vehicle v = new Vehicle(number, type);
                    parkingLot.parkVehicle(v);
                }
                case 2 -> {
                    System.out.print("Enter vehicle number to remove: ");
                    String number = scanner.nextLine();
                    parkingLot.removeVehicle(number);
                }
                case 3 -> parkingLot.displayParkedVehicles();
                case 4 -> parkingLot.displayAvailableSlots();
                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

