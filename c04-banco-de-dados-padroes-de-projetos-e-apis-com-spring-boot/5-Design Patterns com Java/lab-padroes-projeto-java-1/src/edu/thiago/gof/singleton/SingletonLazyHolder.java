package edu.thiago.gof.singleton;
/*
    Singleton "Lazy Holder"

    @see <a href:"https://stackoverflow.com/a/24018148">Referencia</a>

    @author Thiago-1989
 */
public class SingletonLazyHolder {
    public static class SingletonHolder {
        private static final SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance() {

        return SingletonHolder.instance;
    }
}
