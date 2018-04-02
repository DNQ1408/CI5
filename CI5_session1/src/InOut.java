import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        // Scanner
        Scanner keyboardScanner = new Scanner(System.in);
        // nextLine
        // nextInt
        System.out.println("Enter a text:"); // Prompt, question
        String line = keyboardScanner.nextLine();
        // Test
        System.out.println(line);

        System.out.println("Enter a number");
        int x = keyboardScanner.nextInt(); // validate
        System.out.println(x);
    }
}
