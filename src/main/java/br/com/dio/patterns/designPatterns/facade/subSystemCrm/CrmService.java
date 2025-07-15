package br.com.dio.patterns.designPatterns.facade.subSystemCrm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String state, String city) {
        System.out.println("Cliente salvo com as informacoes: " + name + ", " + cep + ", " + state + ", " + city);
    }
}
