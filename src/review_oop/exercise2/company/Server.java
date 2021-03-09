package review_oop.exercise2.company;

public class Server extends  Officer{
    private String job;

    public Server(String fullName, String gender, int year, String address, String job) {
        super(fullName, gender, year, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Server{" +
                "fullName='" + super.getFullName() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", year=" + super.getYear() +
                ", address='" + super.getAddress() + '\'' +
                ", job= " + job +
                '}';
    }
}
