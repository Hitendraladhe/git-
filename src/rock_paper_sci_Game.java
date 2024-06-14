import java.util.Random;
import java.util.Scanner;

public class rock_paper_sci_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        // 0 for Rock ,  1 for paper 2 for Scissor
        Random rand = new Random();
        int robotInput = rand.nextInt(3);

        if (userInput == robotInput) {
            System.out.println("Draw......");
        }
        else if (userInput == 0 && robotInput == 1) {
            System.out.println("Robot win \n You loss");
        }
        else if (userInput == 0 && robotInput == 2) {
            System.out.println("You win \n Robot loss");
        }
        else if (userInput == 1 && robotInput == 2) {
            System.out.println("Robot win \n You loss");
        }
        else if (userInput == 2 && robotInput == 1) {
            System.out.println("You win \n Robot loss");
        }
        //System.out.println(robotInput);
    }
}
