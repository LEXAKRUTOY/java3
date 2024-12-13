
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number");
        double a = in.nextDouble();

        System.out.print("Input second number");
        double b = in.nextDouble();

        System.out.print("Input third number");
        double c = in.nextDouble();

        System.out.println(calculateAverage(a, b, c));
    }

    static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
