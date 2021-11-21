import java.util.Scanner;
public class act3Num6 {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main(String[] args) {
        // Varialble declaration. Double data type because months will be represented as decimal point
        double timeOnDeposit = 0.0;

        Scanner keyboard = new Scanner(System.in);

        // Get time funds are left on deposit from keyboard scanner
        System.out.print("ENTER TIME (YEARS) FUNDS ARE LEFT ON DEPOSIT: ");
        timeOnDeposit = keyboard.nextDouble();

        // If conditional statement to test to equivalent interest rate of the entered time on deposit
        if (timeOnDeposit >= 5) {
            System.out.println("INTEREST RATE: .040");
        }
        else if ((timeOnDeposit < 5) && (timeOnDeposit >= 4)) {
            System.out.println("INTEREST RATE: .035");
        }
        else if ((timeOnDeposit < 4) && (timeOnDeposit >= 3)) {
            System.out.println("INTEREST RATE: .030");
        }
        else if ((timeOnDeposit < 3) && (timeOnDeposit >= 2)) {
            System.out.println("INTEREST RATE: .025");
        }
        else if ((timeOnDeposit < 2) && (timeOnDeposit >= 1)) {
            System.out.println("INTEREST RATE: .020");
        }
        else {
            System.out.println("INTEREST RATE: .015");
        }
    }
}