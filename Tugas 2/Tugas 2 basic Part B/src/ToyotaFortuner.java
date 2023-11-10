class ToyotaFortuner extends Car {
    public ToyotaFortuner() {
        super(4, 80, "Manual");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the Toyota Fortuner's engine.");
    }

    public void engage4WD() {
        System.out.println("Engaging 4WD.");
    }
}