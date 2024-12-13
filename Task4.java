
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input even number");
        int num = in.nextInt();

        System.out.print(isEven(num));
    }

    static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}