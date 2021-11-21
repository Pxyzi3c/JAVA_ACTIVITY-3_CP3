import java.util.Scanner;
public class act3Num5 {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main(String[] args) {
        // Variable declaration and initialization
        double numericalGrade = 0.0; // double because numerical grade can have a decimal point

        Scanner keyboard = new Scanner(System.in);
        
        // Title
        System.out.println("\t\tNUMERICAL GRADE TO LETTER GRADE CONVERSION");
        // Get input from keyboard scanner for numerical grade 
        System.out.print("ENTER NUMERICAL GRADE: ");
        numericalGrade = keyboard.nextDouble();

        // If conditional statement for converting numerical grade into a letter grade
        if (numericalGrade >= 90) {
            System.out.println("LETTER GRADE: A");
        }
        else if ((numericalGrade < 90) && (numericalGrade >= 80)) {
            System.out.println("LETTER GRADE: B");
        }
        else if ((numericalGrade < 80) && (numericalGrade >= 70)) {
            System.out.println("LETTER GRADE: C");
        }
        else if ((numericalGrade < 70) && (numericalGrade >= 60)) {
            System.out.println("LETTER GRADE: D");
        }
        else {
            System.out.println("LETTER GRADE: F");
        }
    }
}