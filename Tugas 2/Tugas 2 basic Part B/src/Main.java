public class Main {
    public static void main(String[] args) {
        HondaJazz jazz = new HondaJazz();
        ToyotaFortuner fortuner = new ToyotaFortuner();
        SuzukiKatana katana = new SuzukiKatana();

        jazz.startEngine();
        jazz.changeGear(2);
        jazz.refuel();

        fortuner.startEngine();
        fortuner.changeGear(4);
        fortuner.refuel();
        fortuner.engage4WD();

        katana.startEngine();
        katana.changeGear(1);
        katana.refuel();
        katana.wheelie();
    }
}




