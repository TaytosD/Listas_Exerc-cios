import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Saudações, a seguir declare três números ");
    System.out.println("");

    System.out.println("Primeiro Número");
    double n1 = scanner.nextDouble();
    System.out.println("Segundo Número");
    double n2 = scanner.nextDouble();
    System.out.println("Terceiro Número");
    double n3 = scanner.nextDouble();

    double nmenor = n1;

    if (n2 < nmenor){
     nmenor = n2;}
    if (n3 < nmenor){
      nmenor = n3;}
    
    double nmaior = n2;

    if (n1 > nmaior){
     nmaior = n1;}
    if (n3 > nmaior){
      nmaior = n3;}

    double nmedio = n3;
    if (nmaior> nmedio && nmedio> nmenor){
     System.out.println("Em ordem decrescente"+ nmaior +">" + nmedio+">" + nmenor);
    } else if (nmaior < nmedio && nmedio > nmenor){
      System.out.println("Em ordem decrescente"+ nmedio +">" + nmenor +">" + nmaior);
    } else {
      System.out.println("Em ordem decrescente "+ n3 +">" + n1 +">" + n2);
    }
    scanner.close();
  }
}
