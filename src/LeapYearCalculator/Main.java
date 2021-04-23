package LeapYearCalculator;

public class Main {
    public static void main(String[] args) {
        boolean a = LeapYear.isLeapYear(-1600);
        System.out.println(a);
        boolean b = LeapYear.isLeapYear(1600);
        System.out.println(b);
        boolean c = LeapYear.isLeapYear(2017);
        System.out.println(c);
        boolean d = LeapYear.isLeapYear(1800);
        System.out.println(d);
    }
}
