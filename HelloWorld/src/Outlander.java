public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", 20, 5, 4,6,false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rateOfSpeedChange) {
        int newVelocity = getCurrentSpeed() + rateOfSpeedChange;

        if (newVelocity == 0) {
            stop();
            changeGears(0);
        } else if (newVelocity >= 0 && newVelocity < 20) {
            changeGears(1);
        } else if (newVelocity >= 20 && newVelocity < 30) {
            changeGears(2);
        } else if (newVelocity >= 30 && newVelocity < 40) {
            changeGears(3);
        } else if (newVelocity >= 40 && newVelocity < 50) {
            changeGears(4);
        } else if (newVelocity >= 50 && newVelocity < 60) {
            changeGears(5);
        } else {
            changeGears(6);
        }

        if (newVelocity > 0) changeVelocity(newVelocity, getDirection());
    }
}
