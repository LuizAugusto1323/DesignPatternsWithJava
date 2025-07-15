package br.com.dio.patterns.designPatterns.facade.subSystemCrm;

public class CepAPI {

    private static CepAPI instance;

    private CepAPI() {
        super();
    }

    public static CepAPI getInstance() {
        if (instance == null) instance = new CepAPI();
        return instance;
    }

    public String getByCity(String cep) {
        return "Presidente Prudente";
    }


    public String getByState(String cep) {
        return "Sao Paulo";
    }

}
