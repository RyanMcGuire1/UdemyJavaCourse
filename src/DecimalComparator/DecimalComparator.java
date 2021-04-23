package DecimalComparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        int xCheck =(int)(x * 1000);
        int yCheck = (int)(y * 1000);
        if(xCheck - yCheck == 0){
            return true;
        }else return false;
    }
}
