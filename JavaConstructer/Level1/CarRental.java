package JavaConstructer.Level1;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 50.0;

    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Generic";
        this.rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental paramRental = new CarRental("Ankush", "Honda Civic", 4);
        defaultRental.display();
        paramRental.display();
    }
}

