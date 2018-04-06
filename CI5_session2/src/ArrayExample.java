public class ArrayExample {
    public static void main(String[] args) {
        /*Array*/
        int[] numbers1 = { 5, 6, 7};
        int[] numbers2 = new int[6];

        System.out.println(numbers1[0]);
        System.out.println(numbers1[1]);

        /*foreach*/
        for (int n: numbers1) {
            System.out.println(n);
        }
        /*fori*/
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
        /*String*/
        String s = "hello CI5";
        char[] characters = s.toCharArray();
        for (char c: characters) {
            System.out.println(c);
        }
    }
}
