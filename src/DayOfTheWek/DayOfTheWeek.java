package DayOfTheWek;

public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printWeekDay(-1);
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
    }

    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");

        }



    }
        public static void printWeekDay (int weekDay){
        if(weekDay == 0){
            System.out.println("Sunday");
        }else if(weekDay == 1){
            System.out.println("Monday");
        }else if(weekDay == 2){
            System.out.println("Tuesday");
        }else if(weekDay == 3) {
            System.out.println("Wednesday");
        }else if(weekDay == 4) {
            System.out.println("Thursday");
        }else if(weekDay == 5) {
            System.out.println("Friday");
        }else if(weekDay == 6) {
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day");
        }
    }
}
