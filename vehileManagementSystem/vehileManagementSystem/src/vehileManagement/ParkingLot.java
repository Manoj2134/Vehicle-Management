package vehileManagement;

import java.util.*;

public class ParkingLot implements Iparking {
    private List<Vehicle> parkedVehicles;
    private final int totalSlots;
    
    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        this.parkedVehicles = new ArrayList<>();
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        if (parkedVehicles.size() >= totalSlots) {
            System.out.println("🚫 Parking Lot Full!");
            return;
        }
        for (Vehicle v : parkedVehicles) {
            if (v.getVehicleNumber().equals(vehicle.getVehicleNumber())) {
                System.out.println("⚠️ Vehicle already parked.");
                return;
            }
        }
        parkedVehicles.add(vehicle);
        System.out.println("✅ Vehicle parked.");
    }

    @Override
    public void removeVehicle(String vehicleNumber) {
        for (Vehicle v : parkedVehicles) {
            if (v.getVehicleNumber().equals(vehicleNumber)) {
                parkedVehicles.remove(v);
                System.out.println("✅ Vehicle removed.");
                return;
            }
        }
        System.out.println("❌ Vehicle not found.");
    }

    @Override
    public void displayParkedVehicles() {
        if (parkedVehicles.isEmpty()) {
            System.out.println("🅿️ No vehicles parked.");
        } else {
            for (Vehicle v : parkedVehicles) {
                System.out.println(v);
            }
        }
    }

    @Override
    public void displayAvailableSlots() {
        int available = totalSlots - parkedVehicles.size();
        System.out.println("📌 Available Slots: " + available + "/" + totalSlots);
    }
}

