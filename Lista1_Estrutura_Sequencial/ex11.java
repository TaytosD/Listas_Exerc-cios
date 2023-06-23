import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Declare o primeiro numero interio");
    double a = entrada.nextDouble();
    System.out.println("Declare o segundo numero interio");
    double b = entrada.nextDouble();
    System.out.println("Declare um numero real");
    double c = entrada.nextDouble();
    double ra = (a * 2) * (b / 2);
    System.out.println("o produto do dobro do primeiro com metade do segundo " + ra);
    double rb = (a * 3) + c;
    System.out.println(" a soma do triplo do primeiro com o terceiro " + rb);
    double rc = (c * c * c);
    System.out.println(" o terceiro elevado ao cubo " + rc);
    entrada.close();
  }
}
