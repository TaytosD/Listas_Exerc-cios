import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    // pede o sexo da pessoa
    System.out.print("Digite o sexo da pessoa (M/F): ");
    char sexo = entrada.next().charAt(0);

    // pede a altura da pessoa
    System.out.print("Digite a altura da pessoa em metros: ");
    double altura = entrada.nextDouble();

    // verifica o sexo da pessoa e calcula o peso ideal
    double pesoIdeal;
    if (sexo == 'M' || sexo == 'm') {
      pesoIdeal = (72.7 * altura) - 58;
    } else if (sexo == 'F' || sexo == 'f') {
      pesoIdeal = (62.1 * altura) - 44.7;
    } else {
      System.out.println("Sexo inválido. Digite M ou F.");
      return;
    }
    // mostra o peso ideal para o sexo informado
    System.out.printf("Para o sexo %s, o peso ideal é: %.2f kg\n", (sexo == 'M' || sexo == 'm') ? "masculino" : "feminino", pesoIdeal);

    entrada.close();
    }
}
