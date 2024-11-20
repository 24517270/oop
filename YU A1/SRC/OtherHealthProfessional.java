// OtherHealthProfessional 子类
public class OtherHealthProfessional extends HealthProfessional {
    private String type;

    public OtherHealthProfessional() {
        super();
    }

    public OtherHealthProfessional(int id, String name, String information, String type) {
        super(id, name, information);
        this.type = type;
    }

    @Override
    public void printDetailedInfo() {
        System.out.println("Health Professional Details:");
        printInfo();
        System.out.println("Type: Other Health Professional, Type: " + type);
    }
}