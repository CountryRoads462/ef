import java.util.Scanner;

class Main {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(((n + ONE) * n + TWO) * n + THREE);
    }
}