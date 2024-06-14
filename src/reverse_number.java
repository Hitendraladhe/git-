import java.util.Arrays;
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int reverse = 0 ;
        //while(num>0){
//            // this the method 1 multiply and and modulo by 10
            // method 1
//            reverse = reverse * 10 +num % 10;
//            System.out.println(reverse);
//            // this the method 2 modulo by 10
//            // method 2 reverse =  num % 10;
//            // method 2 System.out.print(reverse);
                  //num = num / 10;
//            // this is method 3 String
//
        //94}
        //method 1
//        System.out.println(reverse);
        // this is method 3 String
         String temp = ""+ num;
         StringBuilder tempp = new StringBuilder(temp);
         System.out.print(tempp.reverse());

    }
}
