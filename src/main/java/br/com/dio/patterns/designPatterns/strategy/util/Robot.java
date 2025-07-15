package br.com.dio.patterns.designPatterns.strategy.util;

import br.com.dio.patterns.designPatterns.strategy.Behavior;

public class Robot {

    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void move() {
        this.behavior.move();
    }
}
