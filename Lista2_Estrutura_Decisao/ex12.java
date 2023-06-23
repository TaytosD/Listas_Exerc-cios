import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Olá, por favor insira seu nome");
    String nome = scanner.nextLine();
    System.out.println("");

    System.out.println("Qual o valor de sua hora trabalhada ?");
    double valorHora = scanner.nextDouble();

    System.out.println("Quantas horas você trabalha por mês?");
    double horas = scanner.nextDouble();
    double salarioBruto = (horas * valorHora);
    double descontoIR = 0;
    double descontoINSS = salarioBruto * 0.10;
    double descontoFGTS = salarioBruto * 0.11;
    double totalDescontos;
    
    if (salarioBruto <= 900)
      descontoIR = 0;
    else if (salarioBruto <= 1500){
      descontoIR = salarioBruto * 0.05;
    } else if (salarioBruto <= 2500){
      descontoIR = salarioBruto * 0.10;
    } else{
      descontoIR = salarioBruto * 0.20;}

    totalDescontos =  descontoIR + descontoINSS;
    
    double salarioLiquido =  salarioBruto - totalDescontos;

    System.out.println("Salário Bruto: R$ " + salarioBruto);
    System.out.println("(-) IR (" +(descontoIR) + "%): R$ " + descontoIR);
    System.out.println("(-) INSS (10%): R$ " + descontoINSS);
    System.out.println("FGTS (11%): R$ " + descontoFGTS);
    System.out.println("Total de descontos: R$ " + totalDescontos);
    System.out.println("Salário Líquido: R$ " + salarioLiquido);

    scanner.close();
  }
}
