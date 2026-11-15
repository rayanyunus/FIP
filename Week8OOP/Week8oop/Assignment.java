package week8oop;

public class Assignment extends LearningResource
        implements Assessable {

    private double maxScore;
    private double submittedScore;

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getSubmittedScore() {
        return submittedScore;
    }

    public void setSubmittedScore(double submittedScore) {
        this.submittedScore = submittedScore;
    }

    @Override
    public void openResource() {
        System.out.println("Opening assignment: " + getTitle());
    }

    @Override
    public void submitAssessment() {
        System.out.println("Assignment submitted successfully.");
    }

    @Override
    public double calculateScore() {
        return submittedScore;
    }

    @Override
    public String getGrade() {
        double percentage = (submittedScore / maxScore) * 100;

        if (percentage >= 70) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}