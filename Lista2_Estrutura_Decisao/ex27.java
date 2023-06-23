import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantidade de morangos (em Kg):");
    double quantidadeMorangos = scanner.nextDouble();

    System.out.println("Quantidade de maçãs (em Kg):");
    double quantidadeMacas = scanner.nextDouble();

    double precoMorangoAte5Kg = 2.50;
    double precoMorangoAcima5Kg = 2.20;
    double precoMacaAte5Kg = 1.80;
    double precoMacaAcima5Kg = 1.50;
    double valorTotalMorangos = 0.0;
    double valorTotalMacas = 0.0;

    if (quantidadeMorangos <= 5) {
      valorTotalMorangos = quantidadeMorangos * precoMorangoAte5Kg;
    } else {
      valorTotalMorangos = quantidadeMorangos * precoMorangoAcima5Kg;
    }
    
    if (quantidadeMacas <= 5) {
      valorTotalMacas = quantidadeMacas * precoMacaAte5Kg;
    } else {
      valorTotalMacas = quantidadeMacas * precoMacaAcima5Kg;
    }

    double valorTotalCompra = valorTotalMorangos + valorTotalMacas;

    if (quantidadeMorangos + quantidadeMacas > 8 || valorTotalCompra > 25.0) {
      double desconto = valorTotalCompra * 0.1;
      valorTotalCompra -= desconto;
    }
    System.out.printf("Valor a ser pago: R$ %.2f", valorTotalCompra);

    scanner.close();
    }
}
