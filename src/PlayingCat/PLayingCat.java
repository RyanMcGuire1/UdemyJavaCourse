package PlayingCat;

public class PLayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature<= upperLimit;
    }
}
