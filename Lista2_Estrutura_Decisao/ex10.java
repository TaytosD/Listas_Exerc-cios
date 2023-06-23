import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Em qual turno você está estudando?");
    Scanner entrada = new Scanner(System.in);
    String turno = entrada.nextLine();

    if (turno.equalsIgnoreCase ("M") || turno.equalsIgnoreCase ("manha") ){
      System.out.println("Bom dia!!!");
    } else if (turno.equalsIgnoreCase ("V") || turno.equalsIgnoreCase ("vespertino") ){
      System.out.println("Boa tarde!!!");
    } else if (turno.equalsIgnoreCase ("N") || turno.equalsIgnoreCase ("noturno") ){
      System.out.println("Boa noite!!!");
    } else {
      System.out.println("Turno inválido, tente novamente.");
    }

    entrada.close(); 
  }
}
