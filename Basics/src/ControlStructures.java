import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        boolean ifVal = true;
        boolean ifElseVal = true;

        if (ifVal){
            System.out.println("ifVal");
        } else if (ifElseVal) {
            System.out.println("ifElseVal");
        }
        else {
            System.out.println("Else");
        }

        System.out.println(ifVal ? "Inline If True" : "Inline If False");


        int i = 0;
        do {
            System.out.println("do while: " + i);
            i++;
        } while (i<10);

        i = 0;
        while (i<10){
            System.out.println("while: " + i);
            i++;
        };

        for (int j = 1; j <= 10; j++) {
            if (j == 4){

                continue;
            }
            if (j == 9){
                break;
            }
            System.out.println("for: " + j);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter case: ");
        String caseVal = scanner.nextLine();
        switch (caseVal) {
            case "A":
                System.out.println("Case A");
                break;
            case "B":
                System.out.println("Case B");
                break;
            default:
                System.out.println("Other Case");
                break;
        }

    }
}