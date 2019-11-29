public class Vehicle {
    private String name;
    private int size;
    private int currentSpeed;
    private int direction;

    public Vehicle(String name, int size, int currentSpeed, int direction) {
        this.name = name;
        this.size = size;
        this.currentSpeed = currentSpeed;
        this.direction = direction;
    }

    public Vehicle(String name, int size) {
        this(name, size, 0, 0);
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Vehicle.steer() Steering in " + this.direction);
    }

    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.direction = direction;
        System.out.println("Vehicle() now moving at " + speed + " mph in " + direction + "direction");
    }

    public void stop() {
        this.currentSpeed = 0;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getDirection() {
        return direction;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
