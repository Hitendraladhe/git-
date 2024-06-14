import java.util.Scanner;
import java.util.Random;

class Game{
    int userInput;
    int robotInput;
    Scanner sc = new Scanner(System.in);
    public void takeInput(){
        this.userInput = sc.nextInt();
    }
    public  int generateRandomNumber(){
        Random rand = new Random();
        return this.robotInput = rand.nextInt(100);
    }
    Game(){
        if (this.robotInput == this.userInput){
            System.out.println("You Win \n Computer loss....");
        }
        else if (this.robotInput < this.userInput){
            System.out.println("your number is high than Computer number....");
        }
        else if (this.robotInput > this.userInput){
            System.out.println("your number is lesser than Computer number....");
        }
    }
}

public class guesing_game_with_class_method {
    public static void main(String[] args) {
       Game obj = new Game();
        System.out.println(obj.generateRandomNumber());;
    }
}
