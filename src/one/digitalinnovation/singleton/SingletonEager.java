package one.digitalinnovation.singleton;

/**
 * Singleton "apressado"
 * 
 * Desafio Dio
 * 
 * @author glaucoserrano
 */
public class SingletonEager {
  private static SingletonEager instancia = new SingletonEager();

  private SingletonEager() {
    super();
  }

  public static SingletonEager getInstancia() {

    return instancia;
  }

}
