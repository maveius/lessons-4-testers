package lesson.one;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(
                calculator.distnace(new Point(1.0, 0.0), new Point(3.0, 0.0))
        );
    }
}
