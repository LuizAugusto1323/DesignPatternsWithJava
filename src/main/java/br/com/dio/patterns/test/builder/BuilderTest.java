package br.com.dio.patterns.test.builder;

import br.com.dio.patterns.designPatterns.builder.Client;
import br.com.dio.patterns.designPatterns.builder.Director;

public class BuilderTest {
    Director director = new Director();
    Client client = new Client();

    public void initTest() {
        director.createDirector();
        System.out.println("-----------------------------------------");
        client.createClient();
    }

}
