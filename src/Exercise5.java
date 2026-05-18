public class Exercise5 {
    public static void main(String[]args) {
        int id1 = 102456, id2 = 204879, id3 = 309124, id4 = 401562;
        String name1 = "Alice", name2 = "Bob", name3 = "Charlie", name4 = "Diana";
        double score1 = 92.50, score2 = 78.00, score3 = 85.25, score4 = 95.00;
        char grade1 = 'A', grade2 = 'c', grade3 ='B', grade4 = 'A';


        String rowFormat = "%-10s %-15s %-10s %-6s%n";
        String dataFormat = "%-10d %-15s %-10.2f %-6c%n";

        System.out.printf(rowFormat, "ID", "Name", "Score", "Grade" );
        System.out.println("----------------------------------------------");

        double average = (score1 + score2 + score3 + score4) / 4.0;
        System.out.printf("Class Average: %.2f%n", average);
}

}