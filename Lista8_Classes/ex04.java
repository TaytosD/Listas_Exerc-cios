public class Pessoa{
  private String nome;
  private int idade;
  private double peso;
  private double altura;

  public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
  
  public void envelhecer() {
    idade++;
    if (idade < 21) {
      crescer(0.5);
    }
  }

  public void engordar(double quantidade) {
    peso += quantidade;
  }

  public void emagrecer(double quantidade) {
    peso -= quantidade;
  }

  public void crescer(double quantidade) {
    altura += quantidade;
  }

  public String getNome() {
    return nome;
    }

  public int getIdade() {
    return idade;
  }

  public double getPeso() {
    return peso;
  }

  public double getAltura() {
    return altura;
  }
}

class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Davi", 19, 65.2, 168.0);
    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Idade: " + pessoa.getIdade());
    System.out.println("Peso: " + pessoa.getPeso() + " kg");
    System.out.println("Altura: " + pessoa.getAltura() + " cm");
    System.out.println();

    pessoa.envelhecer();
    pessoa.engordar(2.5);
    pessoa.crescer(1.0);

    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Idade: " + pessoa.getIdade());
    System.out.println("Peso: " + pessoa.getPeso() + " kg");
    System.out.println("Altura: " + pessoa.getAltura() + " cm");
    }
}
