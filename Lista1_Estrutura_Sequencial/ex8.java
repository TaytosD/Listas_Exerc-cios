import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Quanto você recebe por hora ?");
    double pagahr = entrada.nextDouble();
    System.out.println("Horas trabalhadas no mês");
    int horames = entrada.nextInt();
    double total = horames * pagahr;
    System.out.println(" Salario mensal R$" + total);
    entrada.close();
  }
}
