package telemedicine.com;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Telemedicine System");
            System.out.println("1. Register as Patient");
            System.out.println("2. Register as Doctor");
            System.out.println("3. Login");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Patient.registerPatient(scanner);
                    break;
                case 2:
                    Doctor.registerDoctor(scanner);
                    break;
                case 3:
                    LoginSystem.login(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
