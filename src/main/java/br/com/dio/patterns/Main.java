package br.com.dio.patterns;

import br.com.dio.patterns.test.adapter.AdapterTest;
import br.com.dio.patterns.test.builder.BuilderTest;
import br.com.dio.patterns.test.facade.FacadeTest;
import br.com.dio.patterns.test.observer.ObserverTest;
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

        System.out.println("*******************************");

        // teste do FACADE
        FacadeTest facadeTest = new FacadeTest();
        facadeTest.initTest();

        System.out.println("*******************************");

        // teste do BUILDER
        BuilderTest builderTest = new BuilderTest();
        builderTest.initTest();

        System.out.println("*******************************");

        // teste do ADAPTER
        AdapterTest adapterTest = new AdapterTest();
        adapterTest.initTest();

        System.out.println("*******************************");

        // teste do OBSERVER
        ObserverTest observerTest = new ObserverTest();
        observerTest.initTest();
    }
}
