import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Responda às perguntas com 'sim' ou 'não'.");
    System.out.println("Telefonou para a vítima?");
    String resposta1 = scanner.nextLine().toLowerCase();
    System.out.println("Esteve no local do crime?");
    String resposta2 = scanner.nextLine().toLowerCase();
    System.out.println("Mora perto da vítima?");
    String resposta3 = scanner.nextLine().toLowerCase();
    System.out.println("Devia para a vítima?");
    String resposta4 = scanner.nextLine().toLowerCase();

    System.out.println("Já trabalhou com a vítima?");
    String resposta5 = scanner.nextLine().toLowerCase();

    int count = 0;

    if (resposta1.equals("sim")) {
        count++;
    } if (resposta2.equals("sim")) {
        count++;
    } if (resposta3.equals("sim")) {
        count++;
    } if (resposta4.equals("sim")) {
        count++;
    } if (resposta5.equals("sim")) {
        count++;
    }
    String classificacao;
    
    if (count == 2) {
      classificacao = "Suspeita";
    } else if (count >= 3 && count <= 4) {
      classificacao = "Cúmplice";
    } else if (count == 5) {
      classificacao = "Assassino";
    } else {
      classificacao = "Inocente";
      }

    System.out.println("Classificação: " + classificacao);

    scanner.close();
    }
}
