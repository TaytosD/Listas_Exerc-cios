import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira seu nome");
    String nome = scanner.nextLine();

    System.out.println("A seguir insira duas notas desse bismestre");
    System.out.println("1° nota:");
    double nota1 = scanner.nextDouble();

    System.out.println("2° nota:");
    double nota2 = scanner.nextDouble();

    double media = (nota1 + nota2)/ 2;
    String conceito;
    
    if (media>= 9 && media<= 10){
      conceito = "A";
    } else if (media >= 7.5 && media < 9.0) {
      conceito = "B";
    } else if (media >= 6.0 && media < 7.5) {
      conceito = "C";
    } else if (media >= 4.0 && media < 6.0) {
      conceito = "D";
    } else {
      conceito = "E";
    }

    if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
      System.out.printf("O aluno %s foi APROVADO!",nome);
      System.out.println("");
      System.out.println("Notas:");
      System.out.printf("1° nota: %f",nota1);
      System.out.println("");
      System.out.printf("2° nota: %f",nota2);
      System.out.println("");
      System.out.printf("Média: %f",media);
      System.out.println("");
      System.out.printf("Conceito: %s",conceito);
    
    } else {
      System.out.printf("O aluno %s foi REPROVADO!",nome);
      System.out.println("");
      System.out.println("Notas:");
      System.out.printf("1° nota: %f",nota1);
      System.out.println("");
      System.out.printf("2° nota: %f",nota2);
      System.out.println("");
      System.out.printf("Média: %f",media);
      System.out.println("");
      System.out.printf("Conceito: %s",conceito);
    }
    scanner.close();
  }
}
