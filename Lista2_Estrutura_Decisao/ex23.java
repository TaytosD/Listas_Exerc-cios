import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    double numero = scanner.nextDouble();

    if (isInteiro(numero)) {
      System.out.println("O número é inteiro.");
    } else {
      System.out.println("O número é decimal.");
      }
      scanner.close();
    }
    public static boolean isInteiro(double numero) {
        return numero == Math.round(numero);
    }
}
