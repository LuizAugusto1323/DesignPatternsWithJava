package br.com.dio.patterns.designPatterns.strategy;

public class AggressiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Se movimenta agressivamente");
    }
}
