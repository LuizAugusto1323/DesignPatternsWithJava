package br.com.dio.patterns.test.strategy;

import br.com.dio.patterns.designPatterns.strategy.AggressiveBehavior;
import br.com.dio.patterns.designPatterns.strategy.Behavior;
import br.com.dio.patterns.designPatterns.strategy.DefensiveBehavior;
import br.com.dio.patterns.designPatterns.strategy.NormalBehavior;
import br.com.dio.patterns.designPatterns.strategy.util.Robot;

public class StrategyTest {

    private final Behavior normalBehavior = new NormalBehavior();
    private final Behavior defensiveBehavior = new DefensiveBehavior();
    private final Behavior aggressiveBehavior = new AggressiveBehavior();
    private final Robot robot = new Robot();

    public void initTest() {
        robot.setBehavior(normalBehavior);
        robot.move();
        System.out.println("-----------------------------------------");
        robot.setBehavior(defensiveBehavior);
        robot.move();
        System.out.println("-----------------------------------------");
        robot.setBehavior(aggressiveBehavior);
        robot.move();
    }

}
