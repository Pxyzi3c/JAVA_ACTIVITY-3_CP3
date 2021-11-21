import java.util.Scanner;
public class act3Num4 {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main(String[] args) {
        // Variable declaration
        int numOfCreditsCompleted;

        Scanner keyboard = new Scanner(System.in);

        // Insert number of credits completed using keyboard scanner
        System.out.print("NUMBER OF CREDITS COMPLETED: ");
        numOfCreditsCompleted = keyboard.nextInt();

        // If conditional statement to determine the grade level based on the num of credits completed
        if (numOfCreditsCompleted < 32) {
            System.out.println("\nGRADE LEVEL: Freshman");
        }
        else if ((numOfCreditsCompleted >= 32) && (numOfCreditsCompleted <= 63)) {
            System.out.println("\nGRADE LEVEL: Sophomore");
        }
        else if ((numOfCreditsCompleted >= 64) && (numOfCreditsCompleted <= 95)) {
            System.out.println("\nGRADE LEVEL: Junior");
        }
        else {
            System.out.println("\nGRADE LEVEL: Senior");
        }
    }
}