import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira um número de 1 a 7");
    int dia = scanner.nextInt();

    if (dia == 1){
      System.out.println("O dia correspondente desse número é Domingo.");
    } else if (dia == 2){
      System.out.println("O dia correspondente desse número é Segunda-Feira.");
    } else if (dia == 3){
      System.out.println("O dia correspondente desse número é Terça-Feira.");
    } else if (dia == 4){
      System.out.println("O dia correspondente desse número é Quarta-Feira.");
    } else if (dia == 5){
      System.out.println("O dia correspondente desse número é Quintaa-Feira.");
    } else if (dia == 6){
      System.out.println("O dia correspondente desse número é Sexta-Feira.");
    } else if (dia == 7){
      System.out.println("O dia correspondente desse número é Sábado.");
    } else{ 
      System.out.println("Esse número é inválido,por favor tente novamente");}
    scanner.close();
  }
}
