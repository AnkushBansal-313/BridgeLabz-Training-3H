package JavaConstructer.Level1;

class UniversityManagement {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void displayStudentDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayPGStudentDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization + ", CGPA: " + getCGPA());
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ankush", 8.5);
        s1.displayStudentDetails();
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg = new PostgraduateStudent(201, "Rohit", 8.8, "Computer Science");
        pg.displayPGStudentDetails();
    }
}
