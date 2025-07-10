import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherQuadraticFileMultiple {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            System.out.print("For a=" + a + ", b=" + b + ", c=" + c + ": ");
            solveQuadratic(a, b, c);
        }
    }

    static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
        }
    }
}