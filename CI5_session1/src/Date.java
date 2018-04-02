public class Date {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int date, year;
        String month, day;
        date = 3;
        year = 2018;
        month = "April";
        day = "Monday";
        System.out.println(String.format("Today is %s, %s %s, %s", day, month, date, year));
        System.out.println("American format:");
        System.out.println(String.format("%s, %s %s, %s", day, month, date, year));
        System.out.println("European format:");
        System.out.println(String.format("%s %s %s, %s", day, date, month, year));
    }
}
