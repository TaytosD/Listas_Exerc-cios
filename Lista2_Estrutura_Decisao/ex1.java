import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("escreva um número");
    double a = entrada.nextDouble();
    System.out.println("escreva outro número");
    double b = entrada.nextDouble();
    if (a > b)
      System.out.println(a+" é maior que "+b);
    else  
      System.out.println(b+" é maior que "+a);
    entrada.close();
  }
}
