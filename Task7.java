
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number:");
        int num = in.nextInt();

        System.out.println("Sum of digits: " + sumDigits(num));
    }

    static int sumDigits(int a) {
        int sum = 0;

        for (char digit : Integer.toString(a).toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        return sum;
    }
}
