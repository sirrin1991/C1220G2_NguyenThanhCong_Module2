package _11_dsa_stack_queue.bai_tap.demering_use_queue;

public class EmployeeList {
    private String gender;
    private int serial;

    public EmployeeList() {
    }

    public EmployeeList(String gender, int serial) {
        this.gender = gender;
        this.serial = serial;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
}
