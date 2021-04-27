package MethodOverloading;

public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim",500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();

        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored "+ score + " Points");
        return score * 1000;
    }
    public static int calculateScore( int score) {
        System.out.println("Unnamed player scored" + " scored " + score + " Points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No PLayer name, no score.");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
       boolean isTrue = (feet >= 0) && (inches >=0 && inches <=12);
       double totalInches = (feet * 12) + inches;
       double centimeters = totalInches *2.54;
       if(isTrue){
           System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
           return centimeters;
       }else return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <0){
            return -1;
        }
        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
