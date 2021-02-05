package _05_access_modifier_static_method.thuc_hanh;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change();

        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
    static class Student {
        private int rollno;
        private String name;
        private static String college = "BBDIT";


        Student(int r, String n) {
            rollno = r;
            name = n;
        }

        public int getRollno() {
            return rollno;
        }

        public void setRollno(int rollno) {
            this.rollno = rollno;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        static void change() {
            college = "CODEGYM";
        }

        void display() {
            System.out.println(rollno + " " + name + " " + college);
        }
    }
}
