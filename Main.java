import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 Subjects marks scored:");

        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();
        int s4 = s.nextInt();
        int s5 = s.nextInt();

        if (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40) {
            int total = s1 + s2 + s3 + s4 + s5;
            double percentage = (total / 450.0) * 100.0;
            System.out.println("The percentage scored is: " + percentage);

            if (percentage >= 75.00) {
                System.out.println("Student passed in Distinction");
            } else if (percentage >= 60.00 && percentage < 75.00) {
                System.out.println("Student passed in First class");
            } else if (percentage >= 50.00 && percentage < 60.00) {
                System.out.println("Student Passed in Second class");
            } else {
                System.out.println("Student passed in Third class");
            }
        } else {
            System.out.println("Student is failed");
        }
    }
}
