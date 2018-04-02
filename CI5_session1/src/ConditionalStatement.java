import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner (System.in);

        System.out.println("Enter Humidity Index:");
        int humidity = keyboardScanner.nextInt();

        // 0 ->20: Dry
        // 20 -> 40: Wet
        // 40 -> 50: Flooded

        if (humidity < 20) {
            System.out.println("Watering now");
        }
        else if (humidity <= 40) {
            System.out.println("Ok");
        }
        else {
            System.out.println("Hey! Start bumper");
        }
    }
}
