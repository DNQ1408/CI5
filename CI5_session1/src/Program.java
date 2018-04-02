public class Program {
    public static void main(String[] args) {
        System.out.println("hello world");

//        Variable
        int i = 1; // = 0
        System.out.println(i);
        int j = 8;
        System.out.println(i+j);

        // String
        String hello = "Hello"; // Shit F6
        System.out.println(hello);

        String question = "How old are you?";
        int age = 20;
        String greetings = hello + " Linh " + question +" "+ age;
        String greetings2 = String.format("%s Linh. %s %s", hello, question, age);
        System.out.println(greetings2);

        // Conversion
        // String <-> Int
        // Int <-> Float
        int x = 10;
        String s = String.valueOf(x);
//        System.out.println(s);

        String numberString = "123";
        int number = Integer.parseInt(numberString);
//        System.out.println(number+10);

        // Float <-> Int
        i = 100;
        float f = i; // upcast;

        float f2 = 200.0f;
//        int i = (int)f2; // explicit : trực tiếp gán ; downcast

    }
}
