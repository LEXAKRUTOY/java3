import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number:");
        int num = in.nextInt();

        System.out.println("Fibonacci number at position " + num + " is: " + fibonacci(num));
    }

    static int fibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        for (int i = 2; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return secondTerm;
    }
}
