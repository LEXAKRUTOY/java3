
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number");
        int a = in.nextInt();

        System.out.print("Input second number");
        int b = in.nextInt();

        System.out.print("Input third number");
        int c = in.nextInt();

        System.out.println(multiply1(a, b));

        System.out.println(multiply2(a, b, c));
    }

    static int multiply1(int a, int b){
        return a * b;
    }
    static int multiply2(int a, int b, int c){
        return a * b * c;
    }
}