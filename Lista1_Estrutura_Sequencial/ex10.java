import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Temperatura em Celsius:");
    double c = entrada.nextDouble();
    double f = (c * 1.8) + 32;
    System.out.println("Temperatura em Fahrenheit: " + f );
    entrada.close();
  }
}
