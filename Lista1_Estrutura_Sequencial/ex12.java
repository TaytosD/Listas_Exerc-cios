import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua altura!");
    double h = entrada.nextDouble();
    double ideal = (72.7 * h) - 58;
    System.out.println("Seu peso ideal é " + ideal);
    entrada.close();
  }
}
