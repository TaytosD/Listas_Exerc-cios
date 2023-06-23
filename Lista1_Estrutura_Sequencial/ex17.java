import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Quantos metros precisam ser pintados? ");
    double metros = entrada.nextDouble();
    if (metros <= 54){
      System.out.println("Será usado um lata de tinta, e você gastará R$80.00");
      System.out.print("Ou serão usados 5 galões de 3.6 litros e será gasto R$125");}
    else 
      {double litros = metros/3;
       double latas = Math.ceil(litros/18);
       double galao = Math.ceil(litros/3.6);
       double preco = latas * 80;
       double precoa = galao * 25; 
       System.out.println("O n° de latas utilizadas é:"+latas+"o n° de galões utilizados é:"+ galao);
       System.out.println("E o valor a ser pago pelas latas é R$" + preco + "E o valor a ser pago pelos galões é R$" + precoa); }
    entrada.close();
              
  }
}
