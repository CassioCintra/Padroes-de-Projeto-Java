package Subsistema2.cep;

public class CepAPI {
    private static CepAPI instance = new CepAPI();
    private CepAPI(){
        super();
    }
    public static CepAPI getInstance(){
        return instance;
    }
    public String recuperarCidade(String cep){
        return "Araraquara";
    }
    public String recuperarEstado(String estado){
        return "SP";
    }
}