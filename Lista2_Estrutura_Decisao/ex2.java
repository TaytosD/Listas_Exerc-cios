import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Declare um número inteiro");
    int n = entrada.nextInt();
    if (n==0)
      System.out.println(n+"número é 0");
    else if (n>0)
      System.out.println(n+" número é positivo");
    else 
      System.out.println(n+" Número negativo");
    entrada.close();
  }
}
