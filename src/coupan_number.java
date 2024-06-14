import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class coupan_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        for (int i=0; i<num; i++){
            Random rand = new Random();
            int random_number  = rand.nextInt(num+2);
            if(num == random_number){
                System.out.println("To genrate the match of coupan number is = "+i);
                break;
            }
            System.out.println(random_number);


        }
        System.out.println();
    }
}
