package sample;

/**
 * Created by verlamov on 15.03.16.
 */
public class Model {
    public long calculation(long a, long b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) return 0;
                return a / b;
        }
        System.out.println("Не известный оператор " + operator);
        return 0;


    }
}
