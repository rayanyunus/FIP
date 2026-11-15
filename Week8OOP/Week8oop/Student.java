package week8oop;

public class Student extends Person
        implements Enrollable, Printable {

    private String studentId;
    private boolean enrolled;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public boolean getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public void enroll() {
        enrolled = true;
        System.out.println("Student enrolled successfully.");
    }

    @Override
    public void withdraw() {
        enrolled = false;
        System.out.println("Student withdrawn successfully.");
    }

    @Override
    public boolean isEnrolled() {
        return enrolled;
    }

    @Override
    public void printDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentId);
    }

    @Override
    public String getPrintFormat() {
        return "PDF";
    }

    @Override
    public boolean isPrintable() {
        return true;
    }
}