import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Tamanho dos lados do Quadrado");
    double l = entrada.nextDouble();
    double area = l * l;
    double soma = area * 2;
    System.out.println(" dobro da area igual a " + soma );
    entrada.close();
  }
}
