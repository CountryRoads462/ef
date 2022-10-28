package converter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static String fractionalPartAsString;
    static BigInteger integerPart;
    static BigInteger fractionalPart;
    static Scanner scanner = new Scanner(System.in);

    static String convertFractionalPart(int sourceBase, int targetBase, String fractionalPartAsString) {
        BigDecimal fractionalPart;
        if (sourceBase != 10) {
            fractionalPart = BigDecimal.ZERO;
            int degree = -1;
            for (char character :
                    fractionalPartAsString.toCharArray()) {
                double number = Character.digit(character, sourceBase);
                double multiplier = Math.pow(sourceBase, degree);
                fractionalPart = fractionalPart.add(BigDecimal.valueOf(number * multiplier));
                degree--;
            }
        } else {
            fractionalPart = new BigDecimal("0." + fractionalPartAsString);
        }

        StringBuilder convertedFractionalPartAsString = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            fractionalPart = fractionalPart.multiply(BigDecimal.valueOf(targetBase));
            convertedFractionalPartAsString.append(fractionalPart.toBigInteger().toString(targetBase));
            fractionalPart = fractionalPart.subtract(BigDecimal.valueOf(fractionalPart.toBigInteger().intValue()));
        }

        return convertedFractionalPartAsString.toString();
    }

    static void convertIntoSourceBaseToTargetBase(int sourceBase, int targetBase) {
        while (true) {
            System.out.printf("Enter number in base %d to convert to base %d (To go back type /back) ", sourceBase, targetBase);
            String userInput = scanner.nextLine();
            if ("/back".equals(userInput)) {
                mainMenu();
                break;
            } else {
                String[] userNumber = userInput.split("\\.");
                integerPart = new BigInteger(userNumber[0], sourceBase);
                if (userNumber.length > 1) {
                    fractionalPartAsString = convertFractionalPart(sourceBase, targetBase, userNumber[1]);
                    System.out.printf("Conversion result: %s.%s\n\n", integerPart.toString(targetBase), fractionalPartAsString);
                } else {
                    System.out.printf("Conversion result: %s\n\n", integerPart.toString(targetBase));
                }
            }

        }
    }

    static void mainMenu() {
        while (true) {
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            String userInput = scanner.nextLine();
            if ("/exit".equals(userInput)) {
                exit(0);
            } else {
                String[] twoBases = userInput.split(" ");
                convertIntoSourceBaseToTargetBase(Integer.parseInt(twoBases[0]), Integer.parseInt(twoBases[1]));
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
