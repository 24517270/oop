// GeneralPractitioner 子类
public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(int id, String name, String information, String specialty) {
        super(id, name, information);
        this.specialty = specialty;
    }

    @Override
    public void printDetailedInfo() {
        System.out.println("Health Professional Details:");
        printInfo();
        System.out.println("Type: General Practitioner, Specialty: " + specialty);
    }
}