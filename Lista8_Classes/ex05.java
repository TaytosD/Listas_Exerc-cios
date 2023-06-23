public class ContaCorrente{
  private int numeroConta;
  private String nomeCorrentista;
  private double saldo = 0;

  public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
    this.numeroConta = numeroConta;
    this.nomeCorrentista = nomeCorrentista;
    this.saldo = saldo;
  }

  public void alterarNome(String novoNome){
    nomeCorrentista = novoNome;
  }

  public double deposito(double deposito){
    saldo += deposito;
    return saldo;
  }
  
  public void sacar(double saque){
    if(saque > saldo) {
      System.out.println("Saldo insuficiente");
    }
    else {
      saldo -= saque;
    }
  }
}

