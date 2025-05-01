import java.util.Scanner;

public class MaiorNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int maior = 0;
    int numero;

    for (int i = 0; i < 5; i++) {
      System.out.println("Digite um número:");
      numero = scanner.nextInt();

      if (numero > maior) {
        maior = numero;
      }

    }

    System.out.println("Maior número é: " + maior);
    scanner.close();

  }
}
