package TeenNumberChecker;

public class Main {
    public static void main(String[] args) {
        boolean a = TeenNumberChecker.hasTeen(9,99,19);
        System.out.println(a);
        boolean b = TeenNumberChecker.hasTeen(23,15,42);
        System.out.println(b);
        boolean c = TeenNumberChecker.hasTeen(22,23,34);
        System.out.println(c);
        boolean d = TeenNumberChecker.isTeen(9);
        System.out.println(d);
        boolean e = TeenNumberChecker.isTeen(13);
        System.out.println(e);
    }
}
