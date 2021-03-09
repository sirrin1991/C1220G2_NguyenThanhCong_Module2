package review_oop.exercise2.company;

public class Engineer extends Officer {
    private String trainingIndustry;

    public Engineer(String fullName, String gender, int year, String address, String trainingIndustry) {
        super(fullName, gender, year, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "fullName='" + super.getFullName() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", year=" + super.getYear() +
                ", address='" + super.getAddress() + '\'' +
                ", training industry= " + trainingIndustry +
                '}';
    }
}
