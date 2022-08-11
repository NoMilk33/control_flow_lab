import java.util.Scanner; //necessary for scanner object

public class SecretNumber {
    public static void main(String[] args) {

//        Prompt user to input number
        System.out.println("Welcome. Please enter your number guess.");

//        Collect user input
        Scanner reader = new Scanner(System.in); // creates scanner object
        int userNumber = reader.nextInt(); //initiates variable based on input

//        Secret number variable initialisation
        int secretNumber = 7; // Would edit code to create random integer if possible

//        If user number is equal to secret number, print "Well Done"
//        If user number is higher than secret number, print "Too high"
//        Otherwise print "Too low" (only other option)
        if (userNumber == secretNumber) {
            System.out.println("You got it right");
        } else if (userNumber > secretNumber) {
            System.out.println("Too high");
        } else {
            System.out.println("Too low");
        }
    }
}
