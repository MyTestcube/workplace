package Triangle;

public class right {
    public static right test;
    public static String test(double a, double b, double c) {
        if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
            return "并且是直角三角形,";
        }
        return "但不是直角三角形,";
    }
}
