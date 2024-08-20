package Classes;

public class ACMEBicycle implements Bicycle{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public String toString() {
        return ("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }

    @Override
    public void changeCadence(int newValue) {

    }

    @Override
    public void changeGear(int newValue) {

    }

    @Override
    public void speedUp(int increment) {

    }

    @Override
    public void applyBrakes(int decrement) {

    }
}
