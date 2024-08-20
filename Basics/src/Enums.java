import Classes.Day;
import Classes.Planet;

public class Enums {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day);

        for (Day d : Day.values()) {
            System.out.println("The day is " + d);
        }


        double mass = 64.5;
        mass /= Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }
}