
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name");
        String name = in.nextLine();

        Hello(name);
    }

    static void Hello(String name) {
        System.out.printf("Hello, %s!", name);
    }
}
