import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite um número inteiro menor que 1000: ");
    int numero = scanner.nextInt();

    if (numero >= 0 && numero < 1000) {
      int centenas = numero / 100;
      int dezenas = (numero % 100) / 10;
      int unidades = numero % 10;
      String resultado = "";
      
      if (centenas > 0) {
        resultado += centenas + " centena" + (centenas > 1 ? "s" : "");
      }
      if (dezenas > 0) {
        if (!resultado.isEmpty()) {
          resultado += ", ";
        }
        resultado += dezenas + " dezena" + (dezenas > 1 ? "s" : "");
        }

      if (unidades > 0) {
        if (!resultado.isEmpty()) {
          resultado += " e ";
        }resultado += unidades + " unidade" + (unidades > 1 ? "s" : "");
        }
        System.out.println(resultado);
    } else {
        System.out.println("Número inválido. O número deve ser menor que 1000.");
        }
    
    scanner.close();
  }
}
