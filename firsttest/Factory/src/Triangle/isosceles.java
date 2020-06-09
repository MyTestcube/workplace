package Triangle;

public class isosceles {
    public static isosceles text;
    public static String text(double a, double b, double c) {
        if (a == b || a == c || b == c ) {
            if (a==b && a==c) {
                return "为等边三角形";
            }
            else
                return "且为等腰三角形,";
        }
        return "不是等腰三角形,";
    }
}
