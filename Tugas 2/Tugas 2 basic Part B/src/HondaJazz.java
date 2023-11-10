class HondaJazz extends Car {
    public HondaJazz() {
        super(4, 40, "Automatic");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the Honda Jazz's engine.");
    }
}