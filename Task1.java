
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("input first number: ");
        int a = in.nextInt();

        System.out.println("input second number: ");
        int b = in.nextInt();

        System.out.println(sum(a, b));
    }

    static int sum(int x, int y) {
        return x + y;
    }

}
