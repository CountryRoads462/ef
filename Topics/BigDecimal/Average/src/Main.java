import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal num1 = scanner.nextBigDecimal();
        BigDecimal num2 = scanner.nextBigDecimal();
        BigDecimal num3 = scanner.nextBigDecimal();
        BigDecimal avg = num1.add(num2.add(num3)).divide(BigDecimal.valueOf(3), 0, RoundingMode.DOWN);
        System.out.println(avg);
    }
}