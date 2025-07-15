package br.com.dio.patterns.designPatterns.observer;

public class EmailObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Email recebido: " + message);
        System.out.println("-----------------------------------------");
    }
}
