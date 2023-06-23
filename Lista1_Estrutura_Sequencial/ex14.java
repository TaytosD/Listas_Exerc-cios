import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Quantidade de peixes em Kilos");
    double quilos = entrada.nextDouble();
    double excesso = (quilos) - 50;
    if (excesso <= 0) {
        System.out.println("Não há débito");
    } else {
      double multa = excesso * 4;
      System.out.println("O débito existente é de: " + multa);
    }
    entrada.close();  
  }  
}
