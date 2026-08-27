public class Main {
    public static void main(String[] args) {

       
        String name = "Rayyan";
        int age = 18;
        double score = 75.5;

        
        if (score >= 50) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }

        
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are under 18.");
        }
    }
}