import java.io.IOException;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to run as server, 2 to run as client:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Server.main(args);
        } else if (choice == 2) {
            Client.main(args);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
