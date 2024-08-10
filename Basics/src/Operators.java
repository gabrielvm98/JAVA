public class Operators {
    public static void main(String[] args) {

        int numberA = 22;
        int numberB = 5;
        double numberC = 22;

        System.out.println(numberA + numberB);
        System.out.println(numberA - numberB);
        System.out.println(numberA / numberB);
        System.out.println(numberC / numberB);
        System.out.println(numberA % numberB);
        System.out.println();

        numberA++;
        numberB *= 3;
        numberC /= 2;

        System.out.println(numberA + " - " + numberB + " - " + numberC + "\n");

        System.out.println(numberA == numberB);
        System.out.println(numberA != numberB);
        System.out.println(numberA < numberB);
        System.out.println(numberA > numberB);
        System.out.println(numberA <= numberB);
        System.out.println(numberA >= numberB);
        System.out.println();

        System.out.println(true || false);
        System.out.println(true && false);
        System.out.println(!false);

    }
}