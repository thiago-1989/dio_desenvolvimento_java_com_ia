package edu.thiago.gof.singleton;
/*
    Singleton "apressado"
    @author Thiago-1989
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstance() {
        return instance;
    }
}
