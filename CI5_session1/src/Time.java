import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour = keyboard.nextInt();
        System.out.print("Enter minute: ");
        int minute = keyboard.nextInt();
        System.out.print("Enter second: ");

        int second = keyboard.nextInt();
        int passedSecond = hour * 60 * 60 + minute * 60 + second;
        int allSecondInDay = 86400;

        System.out.println(String.format("Seconds from midnight: %s", passedSecond));
        System.out.println(String.format("Remaining Seconds: %s", allSecondInDay - passedSecond));
        double percentage = (double)passedSecond / (double)allSecondInDay * 100.0D;
        System.out.println("Percentage of the day that has passed: ");
        System.out.print((float)percentage + "%");
    }
}
