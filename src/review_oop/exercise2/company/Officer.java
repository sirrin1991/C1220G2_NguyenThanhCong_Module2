package review_oop.exercise2.company;

public class Officer {
    private String fullName;
    private String gender;
    private int year;
    private String address;

    public Officer(String fullName, String gender, int year, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.year = year;
        this.address = address;
    }

    public Officer() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                ", address='" + address + '\'' +
                '}';
    }
}
