package br.com.dio.patterns;

import br.com.dio.patterns.test.singleton.SingletonTest;
import br.com.dio.patterns.test.strategy.StrategyTest;

public class Main {
    public static void main(String[] args) {
        // teste do SINGLETON
        SingletonTest singletonTest = new SingletonTest();
        singletonTest.initTest();

        System.out.println("*******************************");

        // teste do STRATEGY
        StrategyTest strategyTest = new StrategyTest();
        strategyTest.initTest();
    }
}
