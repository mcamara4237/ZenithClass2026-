public class Exercise2 {
    public static void main(String[] args) {
        double score = 87.5;
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Score:\t\t" + score);
        System.out.println("Grade:\t\t" + grade);

        if (score >= 60) {
            if (score >= 90) {

                double gpa = 4.0;
                if (gpa >= 3.5) {
                    System.out.println("Congratulations! You are on the Honor Roll.");
                } else {
                    System.out.println("Keep working hard to improve!");
                }
            } else {
                System.out.println("Keep working hard to improve!");
            }
        } else {
            System.out.println("Keep trying! You can do it!");
        }
    }
}