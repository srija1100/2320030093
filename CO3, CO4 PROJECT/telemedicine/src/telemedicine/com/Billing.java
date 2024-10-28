package telemedicine.com;
import java.util.ArrayList;
public class Billing {
	private static ArrayList<Billing> bills = new ArrayList<>();
    private Patient patient;
    private Doctor doctor;
    private String appointmentDate;
    private double amount;
    private boolean paid;

    public Billing(Patient patient, Doctor doctor, String appointmentDate, double amount) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.amount = amount;
        this.paid = false;
    }

    public static void generateBill(Patient patient, Doctor doctor, String appointmentDate) {
        double fee = 50.0; // Flat fee for appointment
        bills.add(new Billing(patient, doctor, appointmentDate, fee));
        System.out.println("Bill generated: $" + fee);
    }

    public static void viewUnpaidBills(Patient patient) {
        System.out.println("Unpaid bills for " + patient.name + ":");
        for (Billing bill : bills) {
            if (bill.patient == patient && !bill.paid) {
                System.out.println("Appointment with Dr. " + bill.doctor.name + " on " + bill.appointmentDate + " | Amount: $" + bill.amount);
            }
        }
    }

    public static void payBill(Patient patient, String appointmentDate) {
        for (Billing bill : bills) {
            if (bill.patient == patient && bill.appointmentDate.equals(appointmentDate) && !bill.paid) {
                bill.paid = true;
                System.out.println("Payment of $" + bill.amount + " successful.");
                return;
            }
        }
        System.out.println("No pending bill for the given appointment.");
    }
}
