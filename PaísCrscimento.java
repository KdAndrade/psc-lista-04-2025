import java.util.Scanner;

public class PaísCrscimento {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double paísA = 80000;
    double paísB = 200000;
    double taxaCrescimentoA = 0.03;
    double taxaCrescimentoB = 0.015;
    int anos = 0;
    while (paísA < paísB) {
      paísA += paísA * taxaCrescimentoA;
      paísB += paísB * taxaCrescimentoB;
      anos++;
    }
    System.out.println("O país A ultrapassará o país B em " + anos + " anos.");
    System.out.printf("População do país A: %.2f%n", paísA);
    System.out.printf("População do país B: %.2f%n", paísB);

    scanner.close();
  }
}
