import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Temperatura em Fahrenheit:");
    double f = entrada.nextDouble();
    double c = 5 * (( f - 32 ) / 9);
    System.out.println("Temperatura em Celsius: " + c );
    entrada.close();
  }
}
