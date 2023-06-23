import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("digite sua nota em Matematica");
    int m = entrada.nextInt();
    System.out.println("digite sua nota em Portugues");
    int p = entrada.nextInt();
    System.out.println("digite sua nota em Ciencias");
    int c = entrada.nextInt();
    System.out.println("digite sua nota em Redação");
    int r = entrada.nextInt();
    int a = 4;
    int soma = (r + c + p + m ) / a;
    System.out.println("Sua média é :" + soma );
    entrada.close();
  }
}
