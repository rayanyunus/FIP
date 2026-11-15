package week8oop;

public class Teacher extends Employee
        implements Schedulable, Assessable {

    private String subject;
    private String scheduleTime;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    public void performDuty() {
        System.out.println("Teacher is teaching students.");
    }

    @Override
    public void schedule() {
        scheduleTime = "Monday, 10 AM";
        System.out.println("Teacher schedule created.");
    }

    @Override
    public void cancelSchedule() {
        scheduleTime = "Not scheduled";
        System.out.println("Teacher schedule cancelled.");
    }

    @Override
    public String getSchedule() {
        return scheduleTime;
    }

    @Override
    public void submitAssessment() {
        System.out.println("Assessment submitted.");
    }

    @Override
    public double calculateScore() {
        return 85.0;
    }

    @Override
    public String getGrade() {
        return "A";
    }
}