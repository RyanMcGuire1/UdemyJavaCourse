package EqualSumChecker;

public class Main {
    public static void main(String[] args) {
        boolean a = EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println(a);
        boolean b = EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println(b);
        boolean c = EqualSumChecker.hasEqualSum(1,-1,0);
        System.out.println(c);
    }
}
