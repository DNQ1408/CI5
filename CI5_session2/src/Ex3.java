public class Ex3 {
    /*Ex 3.2*/
//    Output: No, I wug. You wugga wug. I wug.
    /*Ex 3,3*/
    static void zool (int a, String b, String c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static void printAmerican (String day, int date, String month, int year){
        System.out.println(String.format("%s, %s %s, %s", day, month, date, year));
    }
    static void printEuropean(String day, int date, String month, int year){
        System.out.println(String.format("%s %s %s, %s", day, date, month, year));
    }
    public static void main(String[] args) {
        zool(11, "Chó", "Hai Bà Trưng");
        printAmerican("Friday", 6, "April", 2018);
        printEuropean("Friday", 6, "April", 2018);
    }
}
