package AreaCalculatorExercise;

public class Main {
    public static void main(String[] args) {
        double circle = AreaCalculator.area(5.0);
        System.out.println(circle);

        double invalid = AreaCalculator.area(-1);
        System.out.println(invalid);

        double rectangle = AreaCalculator.area(5.0,4.0);
        System.out.println(rectangle);

        double invRectangle = AreaCalculator.area(-1.0, 4.0);
        System.out.println(invRectangle);
    }
}
