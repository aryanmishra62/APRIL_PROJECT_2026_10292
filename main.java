class Vehicle {
    String vehicleNumber;
    String brand;
    double rentPerDay;

    Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + " | Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        return (rentPerDay * days) + 500; 
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        return (rentPerDay * days); 
    }
}

public class Main {
    public static void main(String[] args) {
        int rentalDays = 3;

        Vehicle myCar = new Car("CAR-101", "Toyota", 1000);
        Vehicle myBike = new Bike("BIKE-202", "Yamaha", 300);

        myCar.displayDetails();
        System.out.println("Car Rent for " + rentalDays + " days: " + myCar.calculateRent(rentalDays));

        System.out.println("-----------------------------------");

        myBike.displayDetails();
        System.out.println("Bike Rent for " + rentalDays + " days: " + myBike.calculateRent(rentalDays));
    }
}
