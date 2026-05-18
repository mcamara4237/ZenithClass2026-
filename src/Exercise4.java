import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentID;
        int score;
        int attemptsID = 0;
        int attemptsScore = 0;

        do {
            System.out.print("Enter a 6 digit student ID: ");
            studentID = scanner.nextInt();
            attemptsID++;
            if (studentID < 100000 || studentID > 999999) {
                System.out.println("Invalid ID. Please enter a 6 digit student number.");
            }
         } while (studentID < 100000 || studentID > 999999);
        do {
            System.out.print("Enter quiz score (0-100): ");
            score = scanner.nextInt();
            attemptsScore++;
            if (score < 0 || score> 100) {
                System.out.println("Invalid score. Please enter a value between 0 and 100.");

            }
        } while (score < 0 ||  score > 100);

        System.out.println("Invalidated Student Data:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Quiz Score: " + score);
        System.out.println("Attempts for ID entry: " + attemptsID);
        System.out.println("Attempts for score entry:" + attemptsScore);

        scanner.close();
    }
}