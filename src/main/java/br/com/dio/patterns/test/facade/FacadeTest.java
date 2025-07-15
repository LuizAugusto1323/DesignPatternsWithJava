package br.com.dio.patterns.test.facade;

import br.com.dio.patterns.designPatterns.facade.Facade;

public class FacadeTest {
    Facade facade = new Facade();

    public void initTest() {
        facade.migrateCustomer("Luiz", "1234567");
    }

}
