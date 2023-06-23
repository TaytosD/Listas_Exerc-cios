import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Programa de triângulos");
    System.out.println("");
    System.out.println("Tamanha do primeiro lado:");
    double lado1 = scanner.nextDouble();
    System.out.println("Tamanha do segundo lado:");
    double lado2 = scanner.nextDouble();
    System.out.println("Tamanha do terceiro lado:");
    double lado3 = scanner.nextDouble();

    String tipo = "";

    if(lado1==lado2 && lado2==lado3){
      tipo= "Equilátero";
    } else if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3){
      tipo="Escaleno";
    } else if ((lado1==lado2 && lado2!=lado3) || (lado1!=lado2 && lado2==lado3) || (lado1 == lado3 && lado2!=lado3)){
      tipo="Isósceles";
    }
    
    System.out.printf("O triângulo de lado %2f, %2f e %2f é um triângulo do tipo %s" ,lado1, lado2,lado3, tipo );
  }
}
