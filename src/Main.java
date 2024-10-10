import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validValue = false;
        int number = (int) (Math.random() * 10) + 1;
        int prediction = 0;

        System.out.println("Hello welcome! lets play a game try to guess my favorite number!");
        do {
            System.out.println("Enter a number 1-10");
            if (scan.hasNextInt()) {
                prediction = scan.nextInt();
                if (prediction >= 1 && prediction <= 10) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid integer");
                }
            } else {
                System.out.println("You have entered an invalid integer");
            }
            scan.nextLine();
        } while (!validValue);

        System.out.println("My number was " + number + ".");
        if(prediction == number) {
            System.out.println("Your guess was correct");
        }else if (prediction > number) {
            System.out.println("your guess was too high");
        }else{
            System.out.println("your guess was too low");
        }
    }
}