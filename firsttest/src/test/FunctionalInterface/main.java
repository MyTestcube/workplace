package test.FunctionalInterface;

public class main {
    public static void main(String[] args) {
        GreetingService greetingService=message -> System.out.println("Hello"+message);
    }
}
