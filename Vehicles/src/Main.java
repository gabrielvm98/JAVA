import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();

        Scanner scanner = new Scanner(System.in);
        String option;

        Boolean running = true;
        while (running){
            System.out.println("Select operation");
            System.out.println("A: Register Vehicle");
            System.out.println("B: Register Conductor");
            System.out.println("C: Assign Conductor to Vehicle");
            System.out.println("D: Show Info");
            System.out.println("E: Start/Stop Vehicle");
            System.out.println("Z: Exit");
            option = scanner.nextLine().toUpperCase();

            switch (option){
                case "A":
                    System.out.println("A selected ...");
                    //TODO
                    break;
                case "B":
                    System.out.println("B selected ...");
                    //TODO
                    break;
                case "Z":
                    System.out.println("Exit Selected");
                    running = false;
                    break;
                default:
                    System.out.println("Operation not recognized");
                    break;
            }
        }
    }
}