import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();
        System.out.print((h2 * 3600 + m2 * 60 + s2) - (h1 * 3600 + m1 * 60 + s1));
    }
}