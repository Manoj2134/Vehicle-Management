package vehileManagement;

public interface Iparking {
    void parkVehicle(Vehicle vehicle);
    void removeVehicle(String vehicleNumber);
    void displayParkedVehicles();
    void displayAvailableSlots();
}

