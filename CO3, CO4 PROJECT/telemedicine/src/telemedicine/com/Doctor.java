package telemedicine.com;
import java.util.ArrayList;
import java.util.Scanner;
public class Doctor extends User{
	private static ArrayList<Doctor> doctors = new ArrayList<>();
    private String specialization;

    public Doctor(String name, String email, String password, String specialization) {
        super(name, email, password);
        this.specialization = specialization;
    }

    public static void registerDoctor(Scanner scanner) {
        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = scanner.nextLine();

        doctors.add(new Doctor(name, email, password, specialization));
        System.out.println("Doctor registered successfully!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor: " + name + " | Specialization: " + specialization);
    }

    public static Doctor getDoctorByEmail(String email) {
        for (Doctor doctor : doctors) {
            if (doctor.getEmail().equals(email)) {
                return doctor;
            }
        }
        return null;
    }
}
