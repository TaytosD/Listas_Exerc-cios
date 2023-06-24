public class Funcionario {
  private String nome;
  private double salario;

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }
  
  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }  
}

class Main {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Cipriano", 5750.0);

    String nome = funcionario.getNome();
    double salario = funcionario.getSalario();

    System.out.println("Nome do funcionário: " + nome);
    System.out.println("Salário do funcionário: R$" + salario);
  }
}
