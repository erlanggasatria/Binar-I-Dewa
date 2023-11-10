class Car extends Vehicle {
    int fuelCapacity;
    String transmissionType;

    public Car(int wheels, int fuelCapacity, String transmissionType) {
        super(wheels, true, true);
        this.fuelCapacity = fuelCapacity;
        this.transmissionType = transmissionType;
    }

    public void refuel() {
        System.out.println("Refueling the car.");
    }

    public void changeGear(int gear) {
        System.out.println("Changing gear to " + gear);
    }
}