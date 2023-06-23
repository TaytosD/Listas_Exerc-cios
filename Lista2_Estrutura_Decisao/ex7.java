import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Declare três números ");
    System.out.println("Primeiro número");
    Double n1 = teclado.nextDouble();
    System.out.println("");
    
    System.out.println("Segundo número");
    Double n2 = teclado.nextDouble();
    System.out.println("");
    
    System.out.println("Terceiro número");
    Double n3 = teclado.nextDouble();
    System.out.println("");
    
    Double nmaior = n1;

    if (n2 > nmaior)
      nmaior = n2;
    if (n3 > nmaior)
      nmaior = n3;

    System.out.println("O maior número é: "+nmaior );

    Double nmenor = n1;

    if (n2 < nmenor)
      nmenor = n2;
    if (n3 < nmenor)
      nmenor = n3;
    
    System.out.println("O menor número é: "+nmenor );    
    teclado.close();
    
  }
}
