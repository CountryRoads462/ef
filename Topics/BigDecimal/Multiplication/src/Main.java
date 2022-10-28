import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal num1 = scanner.nextBigDecimal();
        BigDecimal num2 = scanner.nextBigDecimal();
        System.out.print(num1.multiply(num2));
    }
}