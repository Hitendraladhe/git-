import java.util.Arrays;
import java.util.Scanner;
//
//public class Fibonacci_series {
//
//    static int fibonnaci(int a){
//        if(a<=1){
//            return a;
//        }
//        return fibonnaci(a-1)+ fibonnaci(a-2);
//
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int res = fibonnaci(num);
//        System.out.println(res);
//    }
//
//}

public class Fibonacci_series{
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        while(z<=num){
            System.out.println(z);
            a = b;
            b = z;
            z = a + b ;
            System.out.println(a+" "+b+" "+z);
        }
    }
}