package br.com.dio.patterns.designPatterns.builder;

public class Director {

    public void createDirector() {
        Person person = new Person.Builder()
                .name("Luiz")
                .phone("18 996550391")
                .email("luiz.kirk4@gmail.com")
                .build();

        System.out.println("Diretor criado via Builder: " + person);
    }

}
