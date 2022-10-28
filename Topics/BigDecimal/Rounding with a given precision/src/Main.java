import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal num = scanner.nextBigDecimal();
        int scale = scanner.nextInt();
        System.out.print(num.setScale(scale, RoundingMode.HALF_DOWN));
    }   
}