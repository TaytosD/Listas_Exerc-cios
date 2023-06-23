import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Boletim Escolar");
    System.out.println ("");
    Scanner entrada = new Scanner(System.in);
    System.out.println ("Digite as notas de dois Bimestres");
    System.out.println ("");
    System.out.println ("Primeira nota");
    Double nota1 = entrada.nextDouble();
    System.out.println ("Segunda nota");
    Double nota2 = entrada.nextDouble();
    System.out.println ("Terceira nota");
    double nota3 = entrada.nextDouble();
    Double media = (nota1+nota2+nota3)/3;

    if (media == 10 )
      System.out.println("Aprovado com Distinção");
    else if (media >= 7 )
      System.out.println("Aprovado");
    else
      System.out.println("Reprovado");
    
    entrada.close();
  }
}
