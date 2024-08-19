package edu.thiago.gof.singleton;

public class TestSingleton {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton

        SingletonLazy lazySingleton = SingletonLazy.getInstance();
        System.out.println(lazySingleton);
        lazySingleton = SingletonLazy.getInstance();
        System.out.println(lazySingleton);

        SingletonEager eagerSingleton = SingletonEager.getInstance();
        System.out.println(eagerSingleton);
        eagerSingleton = SingletonEager.getInstance();
        System.out.println(eagerSingleton);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}