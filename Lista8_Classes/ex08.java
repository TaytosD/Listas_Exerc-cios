public class Macaco{
  private String nome;
  private String bucho;

  public Macaco(String nome, String bucho) {
    this.nome = nome;
    this.bucho = "";
  }
  public void comer(String alimento) {
    if (bucho.isEmpty()) {
            bucho += alimento;
    } else {
      bucho += ", " + alimento;
    }
  }

  public void verBucho(){
    if (bucho.isEmpty()) {
      System.out.println("O bucho de " + nome + " está vazio.");
    } else {
      System.out.println("O bucho de " + nome + " contém: " + bucho);
    }
  }
  
  public void digerir() {
    System.out.println("Digerindo alimentos...");
    bucho="";
  }
}
