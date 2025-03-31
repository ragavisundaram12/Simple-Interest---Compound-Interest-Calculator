import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Interest Calculator");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        if (choice == 1) {
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest: " + simpleInterest);
        } else if (choice == 2) {
            System.out.print("Enter number of times interest applied per year: ");
            int n = scanner.nextInt();
            double compoundInterest = principal * Math.pow(1 + (rate / (100 * n)), n * time) - principal;
            System.out.println("Compound Interest: " + compoundInterest);
        } else {
            System.out.println("Invalid choice! Please restart the program.");
        }

        scanner.close();
    }
}
