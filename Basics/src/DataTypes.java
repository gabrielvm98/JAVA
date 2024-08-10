public class DataTypes {
    public static void main(String[] args) {

        //Declaration
        int number1;
        number1 = 11;
        int number2 = 17;

        System.out.println("Number 1: " + number1 + ", Number 2: " + number2);


        //Primitive
        boolean boolVar = true;
        boolVar = false;

        char charVar = 'A';

        byte byteNum = 99;
        short shortNum = 30000;
        int intNum = -2000000000;
        long longNum = 900000000000L;

        float floatNum = 1.2345F;
        double doubleNum = 9.87654;

        //Type Conversion
        int numberI = 7;
        double numberD = numberI;
        System.out.println(numberI + " -> " + numberD);

        double numD = 4.2;
        int numI = (int) numD;
        System.out.println(numD + " -> : " + numI);
        System.out.println();


        //Strings
        String string1 = "Word";
        String string2 = "Word";

        String objString1 = new String("Two Words");
        String objString2 = new String("Two Words");

        System.out.println(string1 + " - " + objString1);

        System.out.println(string1 == string2);
        System.out.println(objString1 == objString2);
        System.out.println(objString1.equals(objString2));

        System.out.printf("This is %d %s and this is %s%n", 1, string2, objString2);
        System.out.println(string1.length());
        System.out.println(string1.isEmpty());
        System.out.println(string1.contains("or"));
        System.out.println(string1.toLowerCase());
        System.out.println(string1.toUpperCase());
        System.out.println(objString1.replace("Two", "Some"));

        System.out.println(string1 + " - " + objString1);

    }
}