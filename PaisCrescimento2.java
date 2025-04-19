import java.util.Scanner;

public class PaisCrescimento2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir;

        do {
            double paisA;
            double paisB;
            double taxaCrescimentoA;
            double taxaCrescimentoB;
            int anos = 0;

            do {
                System.out.println("Digite a população do país A:");
                paisA = scanner.nextDouble();
                if (paisA <= 0) {
                    System.out.println("População inválida. Tente novamente.");
                }
            } while (paisA <= 0);

            do {
                System.out.println("Digite a população do país B:");
                paisB = scanner.nextDouble();
                if (paisB <= 0) {
                    System.out.println("População inválida. Tente novamente.");
                }
            } while (paisB <= 0);

            do {
                System.out.println("Digite a taxa de crescimento do país A (em decimal):");
                taxaCrescimentoA = scanner.nextDouble();
                if (taxaCrescimentoA <= 0) {
                    System.out.println("Taxa de crescimento inválida. Tente novamente.");
                }
            } while (taxaCrescimentoA <= 0);

            do {
                System.out.println("Digite a taxa de crescimento do país B (em decimal):");
                taxaCrescimentoB = scanner.nextDouble();
                if (taxaCrescimentoB <= 0) {
                    System.out.println("Taxa de crescimento inválida. Tente novamente.");
                }
            } while (taxaCrescimentoB <= 0);

            while (paisA < paisB) {
                paisA += paisA * taxaCrescimentoA;
                paisB += paisB * taxaCrescimentoB;
                anos++;
            }

            System.out.println("O país A ultrapassará o país B em " + anos + " anos.");
            System.out.printf("População do país A: %.2f%n", paisA);
            System.out.printf("População do país B: %.2f%n", paisB);

            System.out.println("Deseja executar novamente? (S/N)");
            scanner.nextLine();
            repetir = scanner.nextLine().trim().toUpperCase();

        } while (repetir.equals("S"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
