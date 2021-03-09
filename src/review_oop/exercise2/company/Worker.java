package review_oop.exercise2.company;

public class Worker extends Officer {
    private String level;

    public Worker(String fullName, String gender, int year, String address, String level) {
        super(fullName, gender, year, address);
        this.level = level;
    }

    public Worker(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fullName='" + super.getFullName() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", year=" + super.getYear() +
                ", address='" + super.getAddress() + '\'' +
                ", level= " + level +
                '}';
    }
}
