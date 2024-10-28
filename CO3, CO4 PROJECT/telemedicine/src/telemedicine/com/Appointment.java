package telemedicine.com;
import java.util.Scanner;
public class Appointment {
	private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public static void bookAppointment(Scanner scanner) {
        System.out.print("Enter Patient Email: ");
        String patientEmail = scanner.nextLine();
        Patient patient = Patient.getPatientByEmail(patientEmail);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        System.out.print("Enter Doctor Email: ");
        String doctorEmail = scanner.nextLine();
        Doctor doctor = Doctor.getDoctorByEmail(doctorEmail);

        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        System.out.print("Enter Appointment Date (dd/mm/yyyy): ");
        String date = scanner.nextLine();

        new Appointment(patient, doctor, date);
        System.out.println("Appointment booked successfully on " + date);

        Billing.generateBill(patient, doctor, date);
    }
}
