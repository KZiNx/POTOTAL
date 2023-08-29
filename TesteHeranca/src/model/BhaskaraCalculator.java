import java.util.Scanner;

public class BhaskaraCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o coeficiente a:");
        double a = scanner.nextDouble();

        System.out.println("Digite o coeficiente b:");
        double b = scanner.nextDouble();

        System.out.println("Digite o coeficiente c:");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Raiz 1 (x1): " + x1);
            System.out.println("Raiz 2 (x2): " + x2);
        }

        scanner.close();
    }
}
