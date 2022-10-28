import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        int number = n;
        BigInteger doubleFactorial = BigInteger.ONE;
        while (number > 0) {
            doubleFactorial = new BigInteger(doubleFactorial.multiply(BigInteger.valueOf(number)).toString());
            number -= 2;
        }
        return doubleFactorial;
    }
}