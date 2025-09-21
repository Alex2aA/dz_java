package one.one.four;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println(time1.getTimeFormatted());
        System.out.println(time2.getTimeFormatted());
        System.out.println(time3.getTimeFormatted());

    }
}