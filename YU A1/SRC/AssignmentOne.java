// 主类
import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // 第 3 部分 - 使用类和对象
        System.out.println("// 第 3 部分 - 使用类和对象");
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Health Information", "Cardiology");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Health Information", "Neurology");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Williams", "General Health Information", "Dermatology");
        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Nurse Alice", "Nursing Information", "Nursing");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Therapist Bob", "Therapy Information", "Mental Health");

        gp1.printDetailedInfo();
        gp2.printDetailedInfo();
        gp3.printDetailedInfo();
        ohp1.printDetailedInfo();
        ohp2.printDetailedInfo();
        System.out.println("------------------------------");

        // 第 5 部分 - 预约的收集
        System.out.println("// 第 5 部分 - 预约的收集");
        ArrayList<Appointment> appointments = new ArrayList<>();

        appointments.add(createAppointment("John Doe", "1234567890", "08:00", gp1));
        appointments.add(createAppointment("Jane Smith", "0987654321", "10:00", gp2));
        appointments.add(createAppointment("Alice Johnson", "1122334455", "14:30", ohp1));
        appointments.add(createAppointment("Bob Williams", "5566778899", "16:00", ohp2));

        printExistingAppointments(appointments);
        cancelBooking(appointments, "0987654321");
        printExistingAppointments(appointments);
    }

    public static Appointment createAppointment(String patientName, String patientMobile, String preferredTime, HealthProfessional selectedDoctor) {
        return new Appointment(patientName, patientMobile, preferredTime, selectedDoctor);
    }

    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentInfo();
                System.out.println("------------------------------");
            }
        }
    }

    public static void cancelBooking(ArrayList<Appointment> appointments, String mobile) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(mobile)) {
                appointments.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with mobile: " + mobile);
        }
    }
}