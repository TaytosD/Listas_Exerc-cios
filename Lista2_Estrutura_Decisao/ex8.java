import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Saudações, a seguir informe os preços dos três produtos encontrados");
    System.out.println("");
    
    System.out.println("Primeiro produto");
    double produto1 = scanner.nextDouble();
      
    System.out.println("Segundo produto");
    double produto2 = scanner.nextDouble();

    System.out.println("Terceiro produto");
    double produto3 = scanner.nextDouble();
    
    double produtocomprado = produto1;

    if (produto2 < produtocomprado){
      produtocomprado = produto2;}
    if (produto3 < produtocomprado){
      produtocomprado = produto3;}

    System.out.println("O produto que deve ser comprado é o produto com valor de "+ produtocomprado);
    scanner.close();
  }
}
