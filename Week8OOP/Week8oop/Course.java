package week8oop;

public class Course extends LearningResource
        implements Enrollable {

    private String courseCode;
    private boolean enrolled;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public boolean getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    @Override
    public void openResource() {
        System.out.println("Opening course: " + getTitle());
    }

    @Override
    public void enroll() {
        enrolled = true;
        System.out.println("Course enrollment successful.");
    }

    @Override
    public void withdraw() {
        enrolled = false;
        System.out.println("Course enrollment cancelled.");
    }

    @Override
    public boolean isEnrolled() {
        return enrolled;
    }
}