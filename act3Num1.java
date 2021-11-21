import java.util.Scanner;
public class act3Num1 {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main(String[] args) {
        char inputCode; // variable declaration
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n\t\tINPUT CODE:\t\tMARITAL STATUS");
        System.out.println("\t\tM\t\t\tMarried\n\t\tS\t\t\tSingle\n\t\tD\t\t\tDivorsed\n\t\tW\t\t\tWidowed\n");

        // Input code
        System.out.print("\tINPUT CODE FOR YOUR MARITAL STATUS: ");
        inputCode = keyboard.next().charAt(0);

        // Conditional switch statement to determine the equivalent marital status of the inserted code
        switch(inputCode) {
            case 'M':
                    System.out.println("\tMarried");
                    break;
            case 'S':
                    System.out.println("\tSingle");
                    break;
            case 'D':
                    System.out.println("\tDivorsed");
                    break;
            case 'W':
                    System.out.println("\tWidowed");
                    break;
            default:
                    System.out.println("\tINPUT ERROR");        
        } 
    }
}


/**Write a program that will display a person’s marital status corresponding with the letter input.  
 * The following letter codes are used:
 * INPUT CODE:          MARITAL STATUS:
 * M                    Married
 * S                    Single
 * D                    Divorsed
 * W                    Widowed
 */