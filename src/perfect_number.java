import java.util.Scanner;

public class perfect_number {
    static void find_perfect_number(int num){
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum += i;
                System.out.println(i);
            }
        }
        if (sum == num){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        find_perfect_number(num);
    }
}
