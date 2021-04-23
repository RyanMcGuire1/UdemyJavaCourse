package BarkingDog;

public class Main {
    public static void main(String[] args) {
        boolean wakeUp = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(wakeUp);
        boolean sleepIn = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(sleepIn);
        boolean dontWakeUp = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(dontWakeUp);
        boolean outOfRange = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(outOfRange);
    }
}
