import java.util.Scanner;

public class NomeSenha {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String nome = scanner.nextLine();
    System.out.println("Digite sua senha:");
    String senha = scanner.nextLine();

    while (senha.equals(nome)) {
      System.out.println("Senha não pode ser igual ao nome. Digite uma nova senha:");
      senha = scanner.nextLine();
    }

    System.out.println("Nome: " + nome);
    System.out.println("Senha: " + senha);

    scanner.close();
  }
}
