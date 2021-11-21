import java.util.Scanner;
public class act3Num3 {
    public static void main(String[] args) {
        // Variable declaration and initialization
        double angleInDeg = 0.0; // Data type is double because angles can be in decimal form

        Scanner keyboard = new Scanner(System.in);

        // Input angle in degrees using keyboard scanner
        System.out.print("ENTER ANGLE IN DEGREES: ");
        angleInDeg = keyboard.nextDouble();

        // If conditional statement to determine if the angle entered is a right, acute, or an obtuse
        if (angleInDeg == 90) {
            System.out.println("\nTYPE OF ANGLE: RIGHT ANGLE");
        }
        else if (angleInDeg < 90) {
            System.out.println("\nTYPE OF ANGLE: ACUTE ANGLE");
        }
        else {
            System.out.println("\nTYPE OF ANGLE: OBTUSE ANGLE");
        }
    }
}

/**An acute angle is less than 90 degrees, an obtuse angle is greater than 90 degrees and right angle is equal to 90 degrees.  
 * Using this information, write a program that accepts an angle, in degrees, 
 * and display the type of angle corresponding to the degrees. */