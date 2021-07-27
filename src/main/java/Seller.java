public class Seller {

    private AutoRoom autoRoom;


    public Seller(AutoRoom autoRoom){
        this.autoRoom = autoRoom;
    }


    public synchronized Car sellCar() {
        try {
            System.out.println("Seller: I can receive new cars for selling");
            while (autoRoom.getCars().size() == 0){
                System.out.println("Seller: Can not sell Car producing stopped");
                wait();
            }
            Thread.sleep(1000);
            System.out.println("Seller: Sold");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return autoRoom.getCars().remove(0);
    }

    public synchronized void produseCar() {
        try {
            System.out.println("Toyota: Producing new Car");
            Thread.sleep(3000);
            autoRoom.getCars().add(new Car());
            notify();
            System.out.println("Seller: New car received succsessfully.");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
