import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        /*int ~ integer*/
//        ArrayList<Integer> words = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
//        words.add(7);
//        words.add(8);
//        words.remove(0);
        words.add("...");
        words.add("asd");
//        System.out.println(words);
//        System.out.println(words.get(1));
        words.set(0, "example");
        /*foreach*/
        for (String word: words){
            System.out.println(word);
        }
        /*fori*/
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            System.out.println(word);
        }
//  .add, .remove, .get, .set
    }
}
