package vehileManagement;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String number, String type) {
        this.vehicleNumber = number;
        this.vehicleType = type;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle No: " + vehicleNumber + " | Type: " + vehicleType;
    }
}

