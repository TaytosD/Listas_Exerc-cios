import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("digite o primeiro numero inteiro");
    int x = entrada.nextInt();
    System.out.println("digite o segundo numero inteiro");
    int y = entrada.nextInt();
    int soma = x + y;
    System.out.println("O resultado é:" + soma);
    entrada.close();
  }
}
