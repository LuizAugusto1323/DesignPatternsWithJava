package br.com.dio.patterns.designPatterns.singleton;

public class LazyHolderSingleton {

    private LazyHolderSingleton() {
        super();
    }

    public static LazyHolderSingleton getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        private static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }
}
