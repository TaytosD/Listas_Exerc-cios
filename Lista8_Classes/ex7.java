public class Tamagushi{
  private String nome;
  private int fome; 
  private int saude;
  private int idade;

  public Tamagushi(String nome, int fome, int saude, int idade) {
    this.nome = nome;
    this.fome = fome;
    this.saude = saude;
    this.idade = idade ;
  }
  public void alterarNome(String novoNome) {
    nome = novoNome;
  }

  public void alterarFome(int novaFome) {
    fome = novaFome;
  }

  public void alterarSaude(int novaSaude) {
    saude = novaSaude;
  }

  public void alterarIdade(int novaIdade) {
    idade = novaIdade;
  }

  public String getNome() {
    return nome;
  }

  public int getFome() {
    return fome;
  }

  public int getSaude() {
    return saude;
  }

  public int getIdade() {
    return idade;
  }

  public String getHumor() {
    if (fome <= 5 && saude >= 5) {
      return "Feliz";
    } else if (fome > 5 && saude < 5) {
      return "Triste";
    } else {
      return "Neutro";
    }
  } 
}

class Main {
  public static void main(String[] args) {
    Tamagushi pokemon = new Tamagushi("Torchic", 3, 7, 2);

        System.out.println("Nome: " + pokemon.getNome());
        System.out.println("Fome: " + pokemon.getFome());
        System.out.println("Saúde: " + pokemon.getSaude());
        System.out.println("Idade: " + pokemon.getIdade());
        System.out.println("Humor: " + pokemon.getHumor());
        System.out.println();

        pokemon.alterarFome(8);
        pokemon.alterarSaude(3);
        pokemon.alterarIdade(3);

        System.out.println("Nome: " + pokemon.getNome());
        System.out.println("Fome: " + pokemon.getFome());
        System.out.println("Saúde: " + pokemon.getSaude());
        System.out.println("Idade: " + pokemon.getIdade());
        System.out.println("Humor: " + pokemon.getHumor());
  }
}
