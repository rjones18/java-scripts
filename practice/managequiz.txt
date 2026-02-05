import java.util.Scanner;

/**
 ManageQuiz
 This code allows users to enter up to 10 quiz scores and it then calculates the average, and determines their grade.
 */
public class ManageQuiz {

    public static void main(String[] args) {
        // Step 1: In this step we print the specifications
        printSpecifications();

        Scanner input = new Scanner(System.in);
        double[] grades = new double[10];
        double runningTotal = 0;
        int count = 0;

        // Steps 2/3: In this step we setup the input loop 10-999
        System.out.println("You can enter up to 10 grades. You may enter 999 to quit early.");
        
        while (count < 10) {
            System.out.print("Enter quiz grade number" + " " + (count + 1) + ": ");
            double entry = input.nextDouble();

            // We setup the Sentinal value check in this section
            if (entry == 999) {
                break;
            }

            // In this section we populate array and update accumulators
            grades[count] = entry;
            runningTotal += entry;
            count++;
        }

        // Step 4: In this step we print all the grades into a array
        System.out.println("\n--- Current Grades ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        // Step 5: In this step we compute the average
        if (count > 0) {
            double average = runningTotal / count;
            System.out.printf("\nAverage Grade: %.2f\n", average);

            // Step 6: In this step we determine and print letter grade
            char letterGrade = determineGrade(average);
            System.out.println("Final Grade: " + letterGrade);
        } else {
            System.out.println("No grades were entered.");
        }

        input.close();
    }

    /**
     * This section prints programming specifications for the project.
     */
    public static void printSpecifications() {
        System.out.println("*******************************************");
        System.out.println("Quiz Grade Manager");
        System.out.println("Application Breakdown: The app Collect 10 scores, average them, and grade.");
        System.out.println("How to use App: You will enter scores one by one. Use 999 to exit.");
        System.out.println("*******************************************\n");
    }

    /**
     * Step 6: In this section we setup the decision logic for grading scale.
     * The @param average is the calculated mean of the scores.
     * The @return character represents the letter grade.
     */
    public static char determineGrade(double average) {
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }
}