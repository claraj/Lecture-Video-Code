package week_1_if_else;


// Make a package for the code for each week

// Right-click on java directory, select new then package
// name must be a valid variable name

// Can create java files inside the package with new and then java class


import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;

public class FirstIfStatement {

    // psvm shortcut
    public static void main(String[] args) {

        // Type this code
        // If errors, put cursor on stringInput and press Alt+Enter (PC)
        // If errors, put cursor on stringInput and press Option+Enter (Mac)
        String message = stringInput("Enter some text:");
        System.out.println("Thanks, your message was " + message);

        double price = doubleInput("Please enter the price of chips: ");
        System.out.println("Thanks, the price is $" + price);
    }
}

