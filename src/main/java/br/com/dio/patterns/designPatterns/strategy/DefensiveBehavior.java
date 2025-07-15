package br.com.dio.patterns.designPatterns.strategy;

public class DefensiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Se move defensivamente");
    }
}
