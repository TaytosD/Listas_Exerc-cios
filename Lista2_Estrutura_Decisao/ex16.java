import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Programa de cálculo de raízes de uma equação do segundo grau");
    System.out.println("");
    
    System.out.println("Digite o valor de A:");
    double a = scanner.nextDouble();
    if (a == 0) {
      System.out.println("O valor de A não pode ser igual a zero. A equação não é do segundo grau.");
      return;
    }
    System.out.println("Digite o valor de B:");
    double b = scanner.nextDouble();
    System.out.println("Digite o valor de C:");
    double c = scanner.nextDouble();

    double delta = (b*b) -4*(a*c);
    if (delta < 0){
      System.out.println("Delta é negativo, logo não possui raizes reais.");
      return;
    }
    
    double raizDelta = Math.sqrt(delta);
    double x = (-b)/(2*a);
    double x1 = (-(b) + raizDelta)/(2*a);
    double x2 = (-(b) - raizDelta)/(2*a);

    if (delta == 0){
      System.out.println("Delta é igual a zero, logo possui apenas uma raiz real que é "+ x );
    } else if ( delta > 0){
      System.out.println("Delta possui duas raizes reais, são elas: "+ x1 + " e " + x2 );
    }
    
    scanner.close();
  }
}
