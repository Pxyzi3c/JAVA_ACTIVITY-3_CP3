import java.util.Scanner;
public class act3Num2 {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main (String[] args) {
        // Variable declaration and initialization
        double monthlySales = 0.00;
        double monthlyIncome = 0.00;

        Scanner keyboard = new Scanner(System.in);

        // Insert Monthly Sales
        System.out.print("Insert Monthly Sales: ");
        monthlySales = keyboard.nextDouble();

        // If conditional statement to test the value of the Monthly Sales and compute Monthly Income
        if (monthlySales >= 50000) {
            monthlyIncome = 375 + (monthlySales * .16);
            System.out.printf("Your Monthly Income is: $ %.1f", monthlyIncome);
        }
        else if((monthlySales < 50000) && (monthlySales >= 40000)) {
            monthlyIncome = 350 + (monthlySales * .14);
            System.out.printf("Your Monthly Income is: $ %.1f", monthlyIncome);
        }
        else if((monthlySales < 40000) && (monthlySales >= 30000)) {
            monthlyIncome = 325 + (monthlySales * .12);
            System.out.printf("Your Monthly Income is: $ %.1f", monthlyIncome);
        }
        else if((monthlySales < 30000) && (monthlySales >= 20000)) {
            monthlyIncome = 300 + (monthlySales * .09);
            System.out.printf("Your Monthly Income is: $ %.1f", monthlyIncome);
        }
        else if((monthlySales < 20000) && (monthlySales >= 10000)) {
            monthlyIncome = 250 + (monthlySales * .05);
            System.out.printf("Your Monthly Income is: $ %.1f", monthlyIncome);
        }
        else {
            monthlyIncome = 200 + (monthlySales * .03);
            System.out.printf("Your Monthly Income is: $ %.1f", monthlyIncome);
        }
    }
}