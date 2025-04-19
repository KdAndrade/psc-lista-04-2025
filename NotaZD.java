import java.util.Scanner;

public class NotaZD {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite uma nota de 0 a 10:");
    int nota = scanner.nextInt();
    while (nota < 0 || nota > 10) {
      System.out.println("Nota inválida. Digite uma nota de 0 a 10:");
      nota = scanner.nextInt();
    }
    System.out.println("Nota válida: " + nota);

    scanner.close();
  }
}