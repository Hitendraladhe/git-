import java.util.Scanner;

public class prime_number {
    public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//       char num = sc.next().charAt(0);
//       if(Character.isDigit(num)){
//          int number = Integer.parseInt(String.valueOf(num));
//          for (int i=2; i<number; i++){
//              if(number % i == 0) {
//                  System.out.println(i);
//              }
//          }
//       }
        for(int i=1; i<=100; i++){
            int counter = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    counter++;
                    //System.out.println(i);

                }
            }
            if(counter == 2){
                System.out.println(i);
            }
            //System.out.println(i);
        }



    }
}
