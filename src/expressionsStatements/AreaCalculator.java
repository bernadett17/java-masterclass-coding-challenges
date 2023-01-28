package expressionsStatements;

public class AreaCalculator {
    public static void main(String[]args) {

        System.out.println("The area of a circle = " +area(3));
        System.out.println("The area of a triangle = "+area(2.5,5));

    }
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if ((x < 0 || y < 0) || (x < 0 && y < 0)) {
            return -1.0;
        }

        return x * y;
    }
}


