import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guess number for Start Game");
        int userInput = sc.nextInt();

        Random rand = new Random();
        int robotInput = rand.nextInt(100);
    if(userInput < robotInput){
        System.out.println("Enter number is less than Robot Number ");
    }
    else if(userInput > robotInput){
        System.out.println("Enter number is greater than Robot Number ");
    }
    else {
        System.out.println("You win.....");

    }
    }
}
