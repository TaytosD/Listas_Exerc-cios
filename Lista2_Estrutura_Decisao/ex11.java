import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira seu nome");
    String nome = scanner.nextLine();
    System.out.println("");
    
    System.out.println("Insira seu salário");
    double salario = scanner.nextDouble();
    System.out.println("");
    
    double aumento; 
    
    if ( salario <= 280 ){
      aumento = (salario * 0.20) + salario;
      System.out.printf("Olá %s, seu salário anterior era de %2f, você esta recebendo uma bonificação de 0.20 do seu salário! Seu salário agora será %2f ", nome , salario, aumento);
    } else if( salario>280 && salario <= 700 ){
      aumento = (salario * 0.15) + salario;
      System.out.printf("Olá %s, seu salário anterior era de %2f, você esta recebendo uma bonificação de 0.15 do seu salário! Seu salário agora será %2f ", nome , salario, aumento);
    } else if( salario>700 && salario <= 1500 ){
      aumento = (salario * 0.10) + salario;
      System.out.printf("Olá %s, seu salário anterior era de %2f, você esta recebendo uma bonificação de 0.10 do seu salário! Seu salário agora será %2f ", nome , salario, aumento);
    } else{
      aumento = (salario * 0.05) + salario;
      System.out.printf("Olá %s, seu salário anterior era de %2f, você esta recebendo uma bonificação de 0.05 do seu salário! Seu salário agora será %2f ", nome , salario, aumento);}

    scanner.close();
  } 
}
