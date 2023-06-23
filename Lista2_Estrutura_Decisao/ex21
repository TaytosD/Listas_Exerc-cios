import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do saque (entre 10 e 600 reais): ");
    int valorSaque = scanner.nextInt();

    if (valorSaque >= 10 && valorSaque <= 600) {
      int notas100 = valorSaque / 100;
      int resto = valorSaque % 100;

      int notas50 = resto / 50;
      resto %= 50;

      int notas10 = resto / 10;
      resto %= 10;

      int notas5 = resto / 5;
      resto %= 5;

      int notas1 = resto;

      System.out.println("Notas fornecidas:");
      System.out.println("Notas de 100: " + notas100);
      System.out.println("Notas de 50: " + notas50);
      System.out.println("Notas de 10: " + notas10);
      System.out.println("Notas de 5: " + notas5);
      System.out.println("Notas de 1: " + notas1);
    } else {
        System.out.println("Valor de saque inválido. O valor deve estar entre 10 e 600 reais.");
      }

    scanner.close();
  }
}
