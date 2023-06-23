import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira um número inteiro");
    int n1 = scanner.nextInt();

    if(n1%2 == 0){
      System.out.println("O número informado é par");
    }else 
      System.out.println("O número informado é impar");
    scanner.close();
  }
}
