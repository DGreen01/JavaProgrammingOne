package Chapter7;

import java.util.*;

/**
 * Code to simulate students grades
 *
 * @author Donovan Green
 */
public class C7_1 /**
 * Main Method
 *
 * @param args arguments from command line prompt
 *
 */
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = in.nextInt();
        int[] scores = new int[4];

        System.out.print("Enter " + numberOfStudents + " scores: ");
        scores[0] = in.nextInt();
        scores[1] = in.nextInt();
        scores[2] = in.nextInt();
        scores[3] = in.nextInt();

        displayGrades(scores);
    }

    /**
     * displays the grades
     *
     * @param grades array containing the grades
     */
    public static void displayGrades(int[] grades) {
        int highScore = bestGrade(grades);

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n",
                    i, grades[i], assignLetterGrade(grades[i], highScore));
        }
    }

    /**
     * puts a letter grade with the number grade and returns the letter
     *
     * @param grade grade that the user enters
     * @param highScore the highest grade the user enters
     * @return letter grade
     */
    public static char assignLetterGrade(int grade, int highScore) {

        if (highScore - grade <= 10) {
            return 'A';
        } else if (highScore - grade > 10 && highScore - grade <= 20) {
            return 'B';
        } else if (highScore - grade > 20 && highScore - grade <= 30) {
            return 'C';
        } else if (highScore - grade > 30 && highScore - grade <= 20) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /**
     * returns the best / highest grade
     *
     * @param grades the grades the user entered
     * @return highest score
     */
    public static int bestGrade(int[] grades) {
        int highScore = grades[0];

        for (int grade : grades) {
            if (grade > highScore) {
                highScore = grade;
            }
        }

        return highScore;
    }
}
