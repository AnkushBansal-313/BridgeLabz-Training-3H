package JavaConstructer.Level1;
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 100.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: $" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ankush", "Car");
        Vehicle v2 = new Vehicle("Rohit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(150.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

