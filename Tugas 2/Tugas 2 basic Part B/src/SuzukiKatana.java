class SuzukiKatana extends Car {
    public SuzukiKatana() {
        super(2, 20, "Manual");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the Suzuki Katana's engine.");
    }

    public void wheelie() {
        System.out.println("Performing a wheelie.");
    }
}