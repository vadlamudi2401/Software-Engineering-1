public class WeatherQuadraticHardCoded {
    public static void main(String[] args) {
        // Example coefficients for ax^2 + bx + c = 0
        double a = 1;
        double b = -3;
        double c = 2;
        solveQuadratic(a, b, c);
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