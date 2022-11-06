package one.digitalinnovation.facade;

import subsistema.cep.CepApi;
import subsistema.crm.CRMService;

public class Facade {
  public void migrarCliente(String nome, String cep) {
    String cidade = CepApi.getInstancia().recuperarCidade(cep);
    String estado = CepApi.getInstancia().recuperarEstado(cep);

    CRMService.gravarCliente(nome, cep, cidade, estado);
  }
}
