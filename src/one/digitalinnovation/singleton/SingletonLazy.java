package one.digitalinnovation.singleton;

/**
 * Singleton "preguiçoso"
 * 
 * Desafio Dio
 * 
 * @author glaucoserrano
 */
public class SingletonLazy {
  private static SingletonLazy instancia;

  private SingletonLazy() {
    super();
  }

  public static SingletonLazy getInstancia() {
    if (instancia == null) {
      instancia = new SingletonLazy();
    }
    return instancia;
  }

}
