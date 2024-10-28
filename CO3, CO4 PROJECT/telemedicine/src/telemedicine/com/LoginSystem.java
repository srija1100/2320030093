package telemedicine.com;
import java.util.Scanner;
public class LoginSystem {
	public static void login(Scanner scanner) {
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        User user = findUser(email, password);
        if (user != null) {
            System.out.println("Login successful!");
            postLoginMenu(user, scanner);
        } else {
            System.out.println("Invalid email or password.");
        }
    }

    private static User findUser(String email, String password) {
        Patient patient = Patient.getPatientByEmail(email);
        if (patient != null && patient.getPassword().equals(password)) {
            return patient;
        }

        Doctor doctor = Doctor.getDoctorByEmail(email);
        if (doctor != null && doctor.getPassword().equals(password)) {
            return doctor;
        }

        return null;
    }

    private static void postLoginMenu(User user, Scanner scanner) {
        if (user instanceof Patient) {
            patientMenu((Patient) user, scanner);
        } else if (user instanceof Doctor) {
            doctorMenu((Doctor) user, scanner);
        }
    }

    private static void patientMenu(Patient patient, Scanner scanner) {
        System.out.println("1. Book Appointment");
        System.out.println("2. View Unpaid Bills");
        System.out.println("3. Pay Bill");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                Appointment.bookAppointment(scanner);
                break;
            case 2:
                Billing.viewUnpaidBills(patient);
                break;
            case 3:
                System.out.print("Enter Appointment Date: ");
                String date = scanner.nextLine();
                Billing.payBill(patient, date);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void doctorMenu(Doctor doctor, Scanner scanner) {
        System.out.println("1. View Appointments");
        System.out.println("2. Start Chat");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.println("Feature in development.");
                
                break;
            case 2:
                System.out.print("Enter Patient Email: ");
                String email = scanner.nextLine();
                Patient patient = Patient.getPatientByEmail(email);
                if (patient != null) {
                    ChatSystem.startChat(patient, doctor, scanner);
                } else {
                    System.out.println("Patient not found.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
