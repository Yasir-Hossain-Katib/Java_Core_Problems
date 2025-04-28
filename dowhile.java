import java.util.Scanner;

public class dowhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int secretNumber = 29;
        int guess;

        do{
            System.out.println("Enter an interger between 1 to 100: ");
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Your guess is higher than the number.\nGuess again!");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is lower than the number.\nGuess again!");
            }
        
        }

        while(guess!=secretNumber);
        System.out.println("You guessed the correct number");
        
        }
    }