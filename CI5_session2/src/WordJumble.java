import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordJumble {
    static String chooseWord() {
        String[] words = {
                "cold",
                "tropical",
                "ward",
                "example"
        };
        Random random = new Random();

        int wordIndex = random.nextInt(words.length);
        return words[wordIndex];
    }
    static void shuffle(String word) {
        ArrayList<Character> characterList = new ArrayList<>();
        Random random = new Random();
        //          1. Convert array -> arrayList;
        for (char c: word.toCharArray()){
            characterList.add(c);
        }
        while (characterList.size() > 0) {
            int i = random.nextInt(characterList.size());
            System.out.println(characterList.get(i));
            characterList.remove(i);
        }
    }

    static void guessAndCheck(String word,int nGuess) {
        Scanner keyboard = new Scanner(System.in);
        boolean guessFalse = true;
        int guessCount = 0;
        while (guessFalse && (guessCount >= nGuess)) {
            System.out.println("Your guess");
            String guess = keyboard.nextLine();
            if (guess.equalsIgnoreCase(word)) {
                System.out.println("Bravo");
                guessFalse = false;
            } else {
                guessCount++;
                if (guessCount >= 3) {
                    System.out.println("Too bad");
                    guessFalse = false;
                } else {
                    System.out.println("Wrong. Guess again!");
                }
            }
        }

    }
    public static void main(String[] args) {
//        n word & random -> jumble -> guess, check result
        Scanner keyboard = new Scanner(System.in);
        String word = chooseWord();
        shuffle(word);
        guessAndCheck(word,3);
    }
//          2. Second array
}
