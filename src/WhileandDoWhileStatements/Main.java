package WhileandDoWhileStatements;

public class Main {
    public static void main(String[] args) {
        int count = 1;
////        while(count != 6){
////            System.out.println("Count value is " + count);
////            count++;
////        }
////        count = 1;
////        while(true){
////            if(count == 6){
////                break;
////            }
////            System.out.println("Count value is " + count);
////            count++;
////        }
////        do {
////            System.out.println("Count value was " + count);
////            count++;
////        }while(count != 6);

//        int number = 4;
//        int finishNumber = 20;
//        while (number <= finishNumber){
//            number++;
//            if(!isEven(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }


        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber){
            number++;
            if(!isEven(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
       }
    }

