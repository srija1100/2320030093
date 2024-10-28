package telemedicine.com;
import java.util.Scanner;
public class ChatSystem {
	public static void startChat(Patient patient, Doctor doctor, Scanner scanner) {
        System.out.println("Starting chat between " + patient.name + " and Dr. " + doctor.name);
        System.out.println("Type 'exit' to end the chat.");

        String message;
        while (true) {
            System.out.print(patient.name + ": ");
            message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) break;

            System.out.println("Dr. " + doctor.name + ": Type your response...");
            scanner.nextLine(); 
        }
        System.out.println("Chat ended.");
    }
}
