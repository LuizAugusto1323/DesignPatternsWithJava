package br.com.dio.patterns.designPatterns.builder;

public class Client {

    public void createClient() {
        Person person = new Person.Builder()
                .name("Luiz")
                .email("luiz@email.com")
                .phone("1234-5678")
                .build();

        System.out.println("Cliente criado via Builder: " + person);
    }
}
