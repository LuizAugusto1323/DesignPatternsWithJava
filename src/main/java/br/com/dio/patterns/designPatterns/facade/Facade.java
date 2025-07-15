package br.com.dio.patterns.designPatterns.facade;

import br.com.dio.patterns.designPatterns.facade.subSystemCrm.CepAPI;
import br.com.dio.patterns.designPatterns.facade.subSystemCrm.CrmService;

public class Facade {

    public void migrateCustomer(String name, String cep) {
        String city = CepAPI.getInstance().getByCity(cep);
        String state = CepAPI.getInstance().getByState(cep);
        CrmService.saveClient(name, cep, city, state);
    }

}
