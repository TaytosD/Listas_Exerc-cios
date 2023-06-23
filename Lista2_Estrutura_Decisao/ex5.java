import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Boletim Escolar");
    Scanner entrada = new Scanner(System.in);
    System.out.println ("Digite as notas de dois Bimestres");
    Double nota1 = entrada.nextDouble();
    Double nota2 = entrada.nextDouble();
    Double media = (nota1+nota2)/2;

    if (media == 10 )
      System.out.println("Aprovado com Distinção");
    else if (media >= 7 )
      System.out.println("Aprovado");
    else
      System.out.println("Reprovado");
    
    entrada.close();
  }
}
