package week8oop;

public class Main implements Manageable {

    private String systemName;
    private int recordCount;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    @Override
    public void addRecord() {
        recordCount++;
        System.out.println("Record added successfully.");
    }

    @Override
    public void updateRecord() {
        System.out.println("Record updated successfully.");
    }

    @Override
    public void deleteRecord() {
        if (recordCount > 0) {
            recordCount--;
        }
        System.out.println("Record deleted successfully.");
    }

    public static void main(String[] args) {

        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("-------------------------");

        // Creating a Student object
        Student student = new Student();
        student.setName("John");
        student.setAge(20);
        student.setStudentId("ST001");

        student.displayRole();
        student.printDetails();
        student.enroll();

        System.out.println();

        // Creating a Teacher object
        Teacher teacher = new Teacher();
        teacher.setName("Mr James");
        teacher.setSubject("Java Programming");

        teacher.displayRole();
        teacher.performDuty();

        System.out.println();

        // Creating a Course object
        Course course = new Course();
        course.setTitle("Object Oriented Programming");
        course.setCourseCode("CSC201");

        course.openResource();
        course.enroll();

        System.out.println();

        // Creating an Assignment object
        Assignment assignment = new Assignment();
        assignment.setTitle("Java OOP Assignment");
        assignment.setMaxScore(100);
        assignment.setSubmittedScore(85);

        assignment.openResource();
        assignment.submitAssessment();

        System.out.println("Score: " +
                assignment.calculateScore());

        System.out.println("Grade: " +
                assignment.getGrade());

        System.out.println();

        // Demonstrating Manageable interface
        Main system = new Main();
        system.setSystemName("Student Management System");
        system.addRecord();
        system.updateRecord();

        System.out.println("System: " +
                system.getSystemName());

        System.out.println("Total Records: " +
                system.getRecordCount());

        System.out.println();
        System.out.println("Program completed successfully.");
    }
}