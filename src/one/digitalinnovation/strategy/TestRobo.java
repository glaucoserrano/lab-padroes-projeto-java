package one.digitalinnovation.strategy;

public class TestRobo {
  public static void main(String[] args) {
    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robocop = new Robo();

    robocop.setComportamento(normal);
    robocop.mover();
    robocop.mover();

    robocop.setComportamento(defensivo);
    robocop.mover();

    robocop.setComportamento(agressivo);
    robocop.mover();
    robocop.mover();
    robocop.mover();
    robocop.mover();
  }
}
