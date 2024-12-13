
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number");
        int num = in.nextInt();

        System.out.println("Input a power");
        int pow = in.nextInt();

        System.out.println(power(num, pow));
    }
    static int power(int a, int b){
        return (int) Math.pow(a, b);
    }
}
