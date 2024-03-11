package Facade;

import Subsistema.crm.CrmService;
import Subsistema2.cep.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade =CepAPI.getInstance().recuperarCidade(cep);
        String estado =CepAPI.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
