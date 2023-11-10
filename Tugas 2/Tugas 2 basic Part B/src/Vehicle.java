class Vehicle {
    int wheels;
    boolean canMoveForward;
    boolean canTurn;

    public Vehicle(int wheels, boolean canMoveForward, boolean canTurn) {
        this.wheels = wheels;
        this.canMoveForward = canMoveForward;
        this.canTurn = canTurn;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}