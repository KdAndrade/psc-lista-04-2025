import java.util.Scanner;

public class Autentificacao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome:");
    String nome = scanner.nextLine();

    while (nome.length() < 3) {
      System.out.println("O nome deve ter mais de 3 caracteres.");
      System.out.println("Digite seu nome:");
      nome = scanner.nextLine();
    }

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();
    while (idade < 0 || idade > 150) {
      System.out.println("Idade inválida.");
      System.out.println("Digite sua idade: ");
      idade = scanner.nextInt();
    }

    System.out.println("digite seu salario: ");
    double salario = scanner.nextDouble();
    while (salario <= 0) {
      System.out.println("Salário inválido.");
      System.out.println("Digite seu salário: ");
      salario = scanner.nextDouble();
    }

    System.out.println("Digite seu Sexo: (M/F)");
    char sexo = scanner.next().charAt(0);
    while (sexo != 'M' && sexo != 'F') {
      System.out.println("Sexo inválido.");
      System.out.println("Digite seu Sexo: (M/F)");
      sexo = scanner.next().charAt(0);
    }

    System.out.println("Digite seu estado civil: (S/C/V/D)");
    char estadoCivil = scanner.next().charAt(0);
    while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {
      System.out.println("Estado civil inválido.");
      System.out.println("Digite seu estado civil: (S/C/V/D)");
      estadoCivil = scanner.next().charAt(0);
    }

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salário: " + salario);
    System.out.println("Sexo: " + sexo);
    System.out.println("Estado Civil: " + estadoCivil);
    System.out.println("Cadastro realizado com sucesso!");

    scanner.close();

  }
}
