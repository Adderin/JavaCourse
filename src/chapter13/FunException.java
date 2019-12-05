package chapter13;

public class FunException {

    public static void main(String[] args) {
        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not applicable in usual Math");
        } finally {
            System.out.println("Division is fun");
        }
    }
}
