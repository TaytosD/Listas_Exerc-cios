import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Quantos metros precisam ser pintados? ");
    double metros = entrada.nextDouble();
    if (metros <= 54){
      System.out.println("Será usado uma lata de tinta, e você gastará R$80.00");}
    else 
      {double litros = metros/3;
       double latas = Math.ceil(litros/18);
       double preco = latas * 80;
       System.out.println("O n° de latas utilizadas é:"+latas);
       System.out.println("E o valor a ser pago será R$" + preco); }
    entrada.close();
              
  }
}
