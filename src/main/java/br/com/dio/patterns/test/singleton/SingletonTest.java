package br.com.dio.patterns.test.singleton;

import br.com.dio.patterns.designPatterns.EagerSingleton;
import br.com.dio.patterns.designPatterns.LazyHolderSingleton;
import br.com.dio.patterns.designPatterns.LazySingleton;

public class SingletonTest {

    public void initTest() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("1 - Lazy Singleton: " + lazySingleton);
        lazySingleton = LazySingleton.getInstance();
        System.out.println("2 - Lazy Singleton: " + lazySingleton);

        System.out.println("-----------------------------------------");

        LazyHolderSingleton lazyHolderSingleton = LazyHolderSingleton.getInstance();
        System.out.println("1 - Lazy HolderSingleton: " + lazyHolderSingleton);
        lazyHolderSingleton = LazyHolderSingleton.getInstance();
        System.out.println("2 - Lazy HolderSingleton: " + lazyHolderSingleton);


        System.out.println("-----------------------------------------");

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println("1 - Eager Singleton: " + eagerSingleton);
        eagerSingleton = EagerSingleton.getInstance();
        System.out.println("2 - Eager Singleton: " + eagerSingleton);
    }

}
