public class Quadrado{
  public double valorlado;

  public void mudarValoeLado (double novoValorLado){
    valorLado = novoValorLado;
  }
  public double returnValorLado (){
    return valorLado;
  }
  public double calculoArea(){
    double area = math.pow(valorLado,2);
    return area;
  }
}
