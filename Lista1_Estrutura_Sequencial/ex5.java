import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite em metros");
    double metros = entrada.nextDouble();
    double div = metros * 100;
    System.out.println( metros + " metros é igual a " + div);
    entrada.close();
  }
}
