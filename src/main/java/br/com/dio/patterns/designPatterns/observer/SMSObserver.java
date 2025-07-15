package br.com.dio.patterns.designPatterns.observer;

public class SMSObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("SMS recebido: " + message);
        System.out.println("-----------------------------------------");
    }
}
