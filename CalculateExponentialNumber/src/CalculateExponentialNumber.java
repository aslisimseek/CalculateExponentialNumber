import java.util.Scanner;

public class CalculateExponentialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Number to Prime..:");
        int primeNumber = scanner.nextInt();
        System.out.print("Please Enter a Exponent Number..:");
        int exponentNumber = scanner.nextInt();
        int total = 1;
        for (int i = 1; i <= exponentNumber; i++) {
            total *= primeNumber;
        }
        System.out.print("Total Result..:" + total);
    }
}
