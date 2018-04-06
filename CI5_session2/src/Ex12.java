import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ex12 {
    /*Ex 12.1*/
    static int[] cloneArray(int array[]) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        };
        return newArray;
    }

    /*Ex 12.2*/
    static double randomDouble(double low, double high) {
        Random random = new Random();
        double x = ThreadLocalRandom.current().nextDouble(low, high);
        return x;
    }

    /*Ex 12.3*/
    static int randomInt(int low, int high) {
        Random random = new Random();
        int x = ThreadLocalRandom.current().nextInt(low, high);
        return x;
    }
    /*Ex 12.5*/
    static boolean areFactors(int n, int[] array) {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (n % array[i] == 0) {
                check = true;
            }
            else {
                check = false;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 7};
        int[] newArray = cloneArray(array);
        double rddouble = randomDouble(1,100);
        System.out.println(rddouble);
        int rdint = randomInt(1, 100);
        System.out.println(rdint);
        boolean check = areFactors(210, array);
        System.out.println(check);
    }
}