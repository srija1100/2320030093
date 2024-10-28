package telemedicine.com;
import java.util.ArrayList;
import java.util.Scanner;

public class Patient extends User {
	private static ArrayList<Patient> patients = new ArrayList<>();
    private int age;

    public Patient(String name, String email, String password, int age) {
        super(name, email, password);
        this.age = age;
    }

    public static void registerPatient(Scanner scanner) {
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        patients.add(new Patient(name, email, password, age));
        System.out.println("Patient registered successfully!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient: " + name + " | Age: " + age);
    }

    public static Patient getPatientByEmail(String email) {
        for (Patient patient : patients) {
            if (patient.getEmail().equals(email)) {
                return patient;
            }
        }
        return null;
    }
}
