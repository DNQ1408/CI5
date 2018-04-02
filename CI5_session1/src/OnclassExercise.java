import java.util.Scanner;
public class OnclassExercise {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("m = ?");
        int m = keyboard.nextInt();
        System.out.println("n = ?");
        int n = keyboard.nextInt();
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }
    }
}
