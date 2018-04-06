import java.util.Random;
import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Random number = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = keyboard.nextInt();
        int randnumber = number.nextInt(n) + 1;
        System.out.println(randnumber);
    }
}
