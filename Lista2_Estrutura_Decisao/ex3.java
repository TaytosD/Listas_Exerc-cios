import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Declare seu sexo: F - M");
    String sexo = entrada.nextLine();
    if (sexo.equalsIgnoreCase("F")){
      System.out.println("F - Feminino");}
    else if (sexo.equalsIgnoreCase("M")){
      System.out.println("M - Masculino");}
    else{
      System.out.println("Sexo inválido");}
    entrada.close();
  }
}
