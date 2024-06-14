import java.util.Arrays;

public class practices_java {

//    static void table_of(int n){
//        for (int i = 1; i<=10; i++){
//            System.out.format("%d X %d = %d\n", n, i, n*i);
//        }
//
//    }
//    static void pattern1(int n){
//        for (int i =1; i<=n; i++){
//            for (int j=1; j<i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    static int sum_rec(int n){
        if(n==1 ){
            return 1;
        }
        return n + sum_rec(n-1);
    }
    static void Pattern2(int n){
        if(n> 0){
             Pattern2(n-1);
        }
        else{
            for(int i=0; i<n; i++){
                for (int j =0; j<=i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){

//      table_of(6);
//        pattern1(3);
        System.out.println(fib(2));
        System.out.println(sum_rec(8));
        Pattern2(8);

    }
}
