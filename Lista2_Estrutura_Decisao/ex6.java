import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("A seguir declare três números");
    System.out.println("Primeiro número");
    Double n1 = entrada.nextDouble();
    System.out.println("");
    
    System.out.println("Segundo número");
    Double n2 = entrada.nextDouble();
    System.out.println("");
    
    System.out.println("Terceiro número");
    Double n3 = entrada.nextDouble();
    System.out.println("");
    
    Double nmaior = n1;

    if (n2 > nmaior){
      nmaior = n2;}
    if (n3 > nmaior){
      nmaior = n3;}

    System.out.println("O maior número é: "+nmaior );
    
    entrada.close();
  }
}
