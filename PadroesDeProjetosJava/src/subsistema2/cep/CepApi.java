package subsistema2.cep;

import javax.swing.*;

public class CepApi {
    private static CepApi instancia= new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Carandai";
    }

    public String recuperarEstado(String cep){
        return "MG";
    }
}
