import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Tipo de combustível (A-álcool, G-gasolina):");
    String tipoCombustivel = scanner.nextLine().toUpperCase();
    
    System.out.println("Quantidade de litros vendidos:");
    double quantidadeLitros = scanner.nextDouble();
    
    double precoGasolina = 2.50;
    double precoAlcool = 1.90;
    double valorAPagar = 0.0;
    
    if (tipoCombustivel.equals("A")) {
      if (quantidadeLitros <= 20) {
        valorAPagar = quantidadeLitros * (precoAlcool - (precoAlcool * 0.03));
      } else {
        valorAPagar = quantidadeLitros * (precoAlcool - (precoAlcool * 0.05));
      }
    
    } else if (tipoCombustivel.equals("G")) {
      if (quantidadeLitros <= 20) {
        valorAPagar = quantidadeLitros * (precoGasolina - (precoGasolina * 0.04));
        
    } else {
      valorAPagar = quantidadeLitros * (precoGasolina - (precoGasolina * 0.06));
        }
    }

    System.out.printf("Valor a pagar: R$ %.2f", valorAPagar);

    scanner.close();
    }
}
