package DecimalComparator;

public class Main {
    public static void main(String[] args) {
        boolean a = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(a);
        boolean b = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(b);
        boolean c = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(c);
        boolean d = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(d);
    }
}
