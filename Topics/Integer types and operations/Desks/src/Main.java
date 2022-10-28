import java.util.Scanner;

class Main {
    public static final int ONE = 1;
    public static final int TWO = 2;

    public static int getNumberOfDesks(int numberOfStudents) {
        if (numberOfStudents % TWO == 0) {
            return numberOfStudents / TWO;
        } else {
            return (numberOfStudents + ONE) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int numberOfDesks1 = getNumberOfDesks(group1);

        int group2 = scanner.nextInt();
        int numberOfDesks2 = getNumberOfDesks(group2);

        int group3 = scanner.nextInt();
        int numberOfDesks3 = getNumberOfDesks(group3);

        int numberOfDesks = numberOfDesks1 + numberOfDesks2 + numberOfDesks3;

        System.out.println(numberOfDesks);
    }
}