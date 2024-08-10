import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.printf("Name: %s \n", name);

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // cleans input buffer when not using nextLine
        System.out.println("Age: " + age);

        System.out.print("Enter your country: ");
        String country = scanner.nextLine();
        System.out.println("Country: " + country);

        //scanner.nextDouble();
        //scanner.nextBoolean();

        System.out.print("Enter your day of birth: ");
        int date = Integer.parseInt(scanner.nextLine());
        System.out.println("Date: " + date);


        scanner.close();
    }
}