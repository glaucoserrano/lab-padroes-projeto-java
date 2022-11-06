package one.digitalinnovation.strategy;

public class Robo {

  private Comportamento comportamento;

  public Robo() {
  }

  public void setComportamento(Comportamento comportamento) {
    this.comportamento = comportamento;
  }

  public void mover() {
    comportamento.mover();
  }
}
