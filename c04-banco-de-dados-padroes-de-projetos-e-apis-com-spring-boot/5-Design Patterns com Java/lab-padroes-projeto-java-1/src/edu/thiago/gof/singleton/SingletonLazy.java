package edu.thiago.gof.singleton;
/*
    Singleton "preguiçoso"
    @author Thiago-1989
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
