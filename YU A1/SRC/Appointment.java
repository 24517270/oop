// 预约类
public class Appointment {
    private String patientName;
    private String patientMobile;
    private String preferredTime;
    private HealthProfessional selectedDoctor;

    public Appointment(String patientName, String patientMobile, String preferredTime, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTime = preferredTime;
        this.selectedDoctor = selectedDoctor;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public String getPreferredTime() {
        return preferredTime;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void printAppointmentInfo() {
        System.out.println("Patient Name: " + getPatientName() + ", Mobile: " + getPatientMobile() + ", Time: " + getPreferredTime());
        getSelectedDoctor().printDetailedInfo();
    }
}