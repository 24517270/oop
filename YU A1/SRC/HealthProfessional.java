// 基类
public class HealthProfessional {
    private int id;
    private String name;
    private String information;

    public HealthProfessional() {
    }

    public HealthProfessional(int id, String name, String information) {
        this.id = id;
        this.name = name;
        this.information = information;
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Information: " + information);
    }

    public void printDetailedInfo() {
        printInfo(); // 打印基本信息，子类可以覆盖这个方法
    }
}