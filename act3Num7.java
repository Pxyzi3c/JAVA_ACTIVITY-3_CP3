import java.util.Scanner;
public class act3Num7 {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main(String[] args){
        // Variable declarations
        int modelYear;
        double weight;

        Scanner keyboard = new Scanner(System.in);

        // Input model year
        System.out.print("MODEL YEAR: ");
        modelYear = keyboard.nextInt();
        // Input weight
        System.out.print("WEIGHT (lbs): ");
        weight = keyboard.nextDouble();

        // If conditional statement to evaluate the model year entered
        if (modelYear <= 1990) {
            // Nested if statement to evaluate the weight entered and print the equivalent weight class and registration fee
            if (weight < 2700){
                System.out.println("\nWEIGHT CLASS: 1");
                System.out.println("REGISTRATION FEE: $ 26.50");
            }
            else if ((weight >= 2700) && (weight <= 3800)){
                System.out.println("\nWEIGHT CLASS: 2");
                System.out.println("REGISTRATION FEE: $ 35.50");
            }
            else {
                System.out.println("\nWEIGHT CLASS: 3");
                System.out.println("REGISTRATION FEE: $ 56.50");
            }
        }
        else if ((modelYear >= 1991) && (modelYear <= 1999)) {
            // Nested if statement to evaluate the weight entered and print the equivalent weight class and registration fee
            if (weight < 2700){
                System.out.println("\nWEIGHT CLASS: 4");
                System.out.println("REGISTRATION FEE: $ 35.00");
            }
            else if ((weight >= 2700) && (weight <= 3800)){
                System.out.println("\nWEIGHT CLASS: 5");
                System.out.println("REGISTRATION FEE: $ 45.50");
            }
            else {
                System.out.println("\nWEIGHT CLASS: 6");
                System.out.println("REGISTRATION FEE: $ 62.50");
            }
        }
        else {
            // Nested if statement to evaluate the weight entered and print the equivalent weight class and registration fee
            if (weight < 3500){
                System.out.println("\nWEIGHT CLASS: 7");
                System.out.println("REGISTRATION FEE: $ 49.50");
            }
            else {
                System.out.println("\nWEIGHT CLASS: 8");
                System.out.println("REGISTRATION FEE: $ 62.50");
            }
        }
    }
}
