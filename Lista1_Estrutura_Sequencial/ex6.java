import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o raio do circulo");
    double r = entrada.nextDouble();
    double raio = r * r;
    double soma = raio * 3.14;
    System.out.println("a área é igual a " + soma );
  }
}
