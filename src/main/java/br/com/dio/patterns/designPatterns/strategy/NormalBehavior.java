package br.com.dio.patterns.designPatterns.strategy;

public class NormalBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Se move normalmente");
    }
}
