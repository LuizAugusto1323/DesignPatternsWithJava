package br.com.dio.patterns.designPatterns;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        super();
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
