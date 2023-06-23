import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Preço da hora trabalhada");
    double preçoh = entrada.nextDouble();
    System.out.println("Horas trabalhadas no mês");
    double mes = entrada.nextDouble();
    double salariobruto = mes * preçoh;
    double INSS = salariobruto * 0.08;
    double sindicato = salariobruto * 0.05;
    double IR = salariobruto * 0.11;
    double liquido = salariobruto * 0.23;
    System.out.println("Seu salario bruto é: R$" + salariobruto);
    System.out.println("O desconto do INSS é: R$" + INSS);
    System.out.println("O desconto do sindicato é: R$" + sindicato);
    System.out.println("O desconto do Imposto de Renda é: R$"+ IR);
    System.out.println("O seu salário liquido é: R$"+ liquido);
    entrada.close();  
  }
}
