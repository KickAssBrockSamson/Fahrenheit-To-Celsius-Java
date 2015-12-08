import java.util.Scanner;

/**
 *
 * @author Travis E Mikolay
 * 
 * Converts Fahrenheit to Celsius
 * Program asks the user for a floating point Fahrenheit degree value 
 * and then returns the equivalent value in Celsius degrees 
 * 
 */

/*
C = (F - 32 ) * 5 / 9 

The program should use a loop to keep prompting the user for input until the 
user enters a value to signal the end of the program. An example prompt is 
“Please enter temperature to convert or enter 9999 to exit” 

This assessment covers indefinite looping, console I/O (user prompts, 
formatting output, input testing), arithmetic operations and variable typing. 

Code your program to use best industry practice.  
It should be properly formatted and indented, commented, and use meaningful variable names.
Test your program with several known values to insure that it is correct: 
212F = 100C, 
32F = 0C.

Grading Rubric:
Error free and correct run of the program:  15 points

Comment block at the top of the page that includes your name, date and program information: 5 points

Used Scanner for input: 5 points

Used loop for continuous prompting: 5 points

Used appropriate output printing format: 5 points

The formatting of the code enabled easy reading of the program: 5 points

Uploaded the zipped program to Blackboard - 5points

Copied and pasted the code and the output to the word document with the question: 5 points

*/
public class FahrenheitToCelsius {
    static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String SENTINEL = "exit";
        boolean validValue = false;
        
        double fahrenheit = 0;
        double celsius = 0;
       

        String trash = "";
        
        while(!validValue) 
        {
            // Prompt User to input Numeric Value
            System.out.print("Please enter temperature to convert or enter \"exit\" to exit: ");
            
            //fahrenheit = ;
            //99fahrenheit = getInt(-1, 100);

            // Validate the Input and process if correct
            if(in.hasNextDouble())
            {
                // Input the Value from the User
                fahrenheit = in.nextDouble();

                // converts user input to celsius
                celsius = ((fahrenheit - 32 ) * 5) / 9;

                // Output the Results
                System.out.println("\n" + fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius");
            }
            else if(SENTINEL.equals(in.nextLine().trim())) 
            {
                validValue = true;
            } 
            else // Bad input!
            {
                // Clear the Pipe
                trash = in.nextLine();
                System.out.println(trash + " is not a valid degree in Fahrenheit. Try again.");
            }   
        }
    }   
}
