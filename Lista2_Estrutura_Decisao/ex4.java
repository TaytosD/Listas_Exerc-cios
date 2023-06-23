import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite uma letra");
    String letra = teclado.next().toLowerCase();
    
    switch (letra) {
      case "a":
      case "e":
      case "i":
      case "o":
      case "u":
      System.out.println("A letra '" + letra + "' é uma vogal.");
      break;
      
      default:
      System.out.println("A letra '" + letra + "' é uma consoante.");
      break;
        }
    teclado.close();
  }
}
