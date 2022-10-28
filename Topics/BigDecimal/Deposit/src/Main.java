import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal startingAmount = scanner.nextBigDecimal();
        double yearlyPercent = scanner.nextDouble();
        int years = scanner.nextInt();
        BigDecimal multiplier = new BigDecimal(Double.toString(1.0 + (yearlyPercent / 100.0)));
        multiplier = multiplier.pow(years);
        BigDecimal finalAmount = startingAmount.multiply(multiplier);
        System.out.print("Amount of money in the account: ");
        System.out.print(finalAmount.setScale(2, RoundingMode.CEILING));
    }
}
