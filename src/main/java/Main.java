public class Main {
    public static void main(String[] args) {
        final AutoRoom autoRoom = new AutoRoom();

        new Thread(null, autoRoom::sellCar,"Customer").start();
        new Thread(null, autoRoom::sellCar, "Car Seller").start();

        new Thread(null, autoRoom::acceptCar,"Toyota").start();
    }
}
