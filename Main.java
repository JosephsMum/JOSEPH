import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Joseph joseph = new Joseph();
        System.out.println("Joseph has been instantiated.");

        while (true) {
            input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println(joseph.speak());
        }
        scanner.close();
    }
}