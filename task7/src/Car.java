public class Car extends Vehicle {
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
    @Override
    public void start() {
        System.out.println("Car starting");
    }
    @Override
    public void stop() {
        System.out.println("Car stopping");
    }
}
