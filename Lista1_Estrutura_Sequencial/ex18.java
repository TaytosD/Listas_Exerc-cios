import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Tamanho do arquivo em MB");
    double mb = entrada.nextDouble();
    System.out.println("Velocidade de um link de Internet em Mbps");
    double velocidade = entrada.nextDouble();
    double tempo = (mb/velocidade) / 60;
    System.out.println("O download levará: " + tempo + " minutos");
    entrada.close();
  }
}
