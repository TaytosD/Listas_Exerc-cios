public class Retangulo{
  private double LadoA;
  private double LadoB;

  public ContaCorrente(double LadoA, double LadoB) {
    this.LadoA = LadoA;
    this.LadoB = LadoB;
  }
  
  public void mudarLadoA (double novoLadoA){
    LadoA = novoLadoA;
  }  
  public void mudarLadoB (double novoLadoB){
    LadoB = novoLadoB;
  }  
  public double returnLadoA(){
    return LadoA;
  }
  public double calcularArea(){
    double area = (LadoA * LadoB);
    return area;
  }


import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Retangulo retangulo = new Retangulo();

    System.out.println("Insira o valor do lado A: ");
    double lado1 = scanner.nextDouble();

    System.out.println("Insira o valor do lado B: ");
    double lado2 = scanner.nextDouble();

    double area = retangulo.calcularArea(lado1, lado2);
    double perimetro = retangulo.calcularPerimetro(lado1, lado2);

    System.out.println("O resultado do cálculo da área do retangulo é: " + area);

    System.out.println("O resultado do cálculo do perímetro do retangulo é: " + perimetro );  
    scanner.close();
  }
}
